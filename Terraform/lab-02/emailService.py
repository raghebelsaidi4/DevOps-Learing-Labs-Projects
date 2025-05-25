# lambda_function.py
import boto3

def lambda_handler(event, context):
    client = boto3.client('ses')
    response = client.send_email(
        Source='ragheb@gmail.com',
        Destination={
            'ToAddresses': ['target-email@example.com']
        },
        Message={
            'Subject': {'Data': 'Terraform Notification'},
            'Body': {'Text': {'Data': 'State file has changed'}}
        }
    )
    return response