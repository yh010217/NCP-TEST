#!/usr/bin/expect -f

set timeout -1

# Ncloud 설정
spawn ./ncp_cli/cli/cli_linux/ncloud configure
expect "Ncloud Access Key Id [] :"
send "test access\r"
expect "Ncloud Secret Access Key [] :"
send "test secret\r"
expect "Ncloud API URL (default:https://ncloud.apigw.ntruss.com) []:"
send "\r"

expect eof