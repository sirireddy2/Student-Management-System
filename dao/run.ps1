$project = 'C:\Users\siri\Downloads\Student-Management-System-main\Student-Management-System-main\StudentManagement'
$jar = 'C:\Users\siri\Downloads\mysql-connector-j-26.7.0\mysql-connector-j-26.7.0\mysql-connector-j-26.7.0.jar'
$out = Join-Path $project 'out'
$sources = Get-ChildItem -Path $project -Filter '*.java' -Recurse | ForEach-Object { $_.FullName }
javac -cp $jar -d $out $sources
if ($LASTEXITCODE -eq 0) { java -cp "$out;$jar" main.Main }