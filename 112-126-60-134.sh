echo -e '\033]2;CryptoNightBBC (BBC) - bbcpool pool\007'
./CryptoDredge -a cnbbc -o stratum+tcp://112.126.60.134:3333 -u 1gggmzwemcb8q7255xqtvkg9j2bca1jza2kd7mm6bwd60nxpkbe1dt3db -p 0 --retry-pause 1 --rig-id 0
printf "Press <ENTER> to continue..."
read -r continueKey