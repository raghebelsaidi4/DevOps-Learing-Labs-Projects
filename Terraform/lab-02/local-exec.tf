resource "aws_instance" "bastion" {
  provisioner "local-exec" {
    command = "echo Bastion IP is ${self.public_ip}"
  }
}