
$ErrorActionPreference = "Stop"

Set-Location $PSScriptRoot

$jar = Get-ChildItem -Filter "mysql-connector-j*.jar" |
    Select-Object -First 1 -ExpandProperty FullName

if (-not $jar) {
    Write-Host "MySQL Connector JAR dorakaledu."
    exit 1
}

$files = Get-ChildItem -Recurse -Filter "*.java" |
    Where-Object { $_.FullName -notmatch '\\out\\' } |
    ForEach-Object { $_.FullName }

if (-not $files) {
    Write-Host "Java files dorakaledu."
    exit 1
}

New-Item -ItemType Directory -Force -Path "out" | Out-Null

javac -cp $jar -d out $files

if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed. Errors paina check cheyyi."
    exit 1
}

java -cp "out;$jar" main.Main
