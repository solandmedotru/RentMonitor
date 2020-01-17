echo -e '\033]2;CryptoNightBBC (BBC) - bbcpool pool\007'
./CryptoDredge -a cnbbc -o stratum+tcp://112.126.60.134:3333 -u 1pcy05stvmsf3ptc55px6pbhvcpqhx1h55et44zv8rvef0j7ywp9p30m5 -p 0 --retry-pause 1 --rig-id 0
printf "Press <ENTER> to continue..."
read -r continueKey