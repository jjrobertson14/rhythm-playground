# Run this command to create the dictateFunction
aws lambda update-function-configuration --function-name dictateFunction --handler dictate.Handler --memory 500 --timeout 60

# Run this to invoke the function
aws lambda invoke --function-name dictateFunction --payload fileb://event.json response.txt
