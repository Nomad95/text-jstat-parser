@echo off
for /f "tokens=1-8 delims=::./ " %%A in ('echo %DATE% %TIME%') do set  FileDateTime=%%D-%%C-%%B_%%E-%%F-%%G
for /f "tokens=1,* delims= " %%a in ("%*") do set ALL_BUT_FIRST=%%b
setlocal enabledelayedexpansion

echo all but first: %ALL_BUT_FIRST%

jstat %ALL_BUT_FIRST% > "%1%-FileDateTime%.txt"