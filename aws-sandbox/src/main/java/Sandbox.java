public class Sandbox {
    /**
     * To List AWS Profiles:
     *      aws configure list-profiles
     * To get AWS profile access key info
     *      aws sts get-access-key-info --profile [AWS profile name]
     * To list s3 profiles:
     *      aws s3 ls --profile [AWS profile name]
     * To remove/delete bucket:
     *      set bucketToDelete=[bucket name]
     *      aws s3 rb s3://%bucketToDelete% --profile [AWS profile name]
     *      Can pass --debug
     *          aws s3 rb s3://%bucketToDelete% --profile [AWS profile name] --debug
     * To list IAM policies
     *      aws iam list-policies --output text --query "Policies[?PolicyName == `S3-Delete-Bucket-Policy`].Arn" --profile [AWS profile name]
     * To list IAM policy by ARN
     *      policyArn=[IAM policy ARN string]
     *      aws iam get-policy-version --policy-arn %policyArn% --version-id v1 --profile [AWS profile name]
     * To list IAM policies attached to a role by role name (passing profile as well)
     *      aws iam list-attached-role-policies --role-name notes-application-role --profile [AWS profile name]
     * To attach an IAM policy by ARN to a role by role name (passing profile as well)
     *      aws iam attach-role-policy --policy-arn %policyArn% --role-name notes-application-role --profile [AWS profile name]
     */
    public static void main(String[] args) {

    }
}
