# Create Workspace dev and prod

-> terraform workspace new dev
-> terraform workspace new prod

# create variables for each ENV (.tfvars)

***dev.tfvars***
-> region = "us-east-1"
-> environment = "dev"

***prod.tfvars***
-> region = "eu-central-1"
-> environment = "prod"