resource "aws_db_instance" "db" {
  engine            = "postgres"
  instance_class    = "db.t3.micro"
  allocated_storage = 20
  name              = "mydb"
  username          = "admin"
  password          = "password"
  skip_final_snapshot = true
}