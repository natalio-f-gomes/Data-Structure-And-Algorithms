git add .

echo "Enter commit message:"
read message

# If you want to allow empty message → use commit --allow-empty-message
git commit -m "$message"

git push -u origin main
