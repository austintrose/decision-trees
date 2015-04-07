#!/bin/bash
echo "
rdr pass on lo0 inet proto tcp from any to self port 80 -> 127.0.0.1 port 8080
rdr pass on en0 inet proto tcp from any to any port 80 -> 127.0.0.1 port 8080
" | sudo pfctl -ef -
