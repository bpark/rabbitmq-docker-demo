VAGRANTFILE_API_VERSION = "2"
Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|

  config.vm.provider "virtualbox"
  config.vm.box = "centos/atomic-host"

  config.vm.network "private_network", ip: "192.168.77.8"
  config.vm.hostname = "rabbitmq-docker-demo-vm"

  config.vm.provider "virtualbox" do |vb|
    # Name of the virtual machine
    vb.name = "rabbitmq-docker-demo-vm"
    # Display the VirtualBox GUI when booting the machine
    vb.gui = false
    # Customize the amount of memory on the VM:
    vb.memory = "4096"
    vb.cpus = 4
  end

  config.vm.provision "shell", privileged: true, path: "vagrant/install.sh"
  config.vm.provision "shell", privileged: true, path: "vagrant/start.sh", run: "always"

  config.vm.synced_folder './', '/var/workspace/', type: "rsync"

end
