#!/bin/bash

echo "🔧 Setting up Nested If Assignment environment..."

# Make sure we're in the right directory
cd "$(dirname "$0")"

# Compile the project
echo "📦 Compiling Java project..."
mvn -q clean compile

if [ $? -eq 0 ]; then
    echo "✅ Setup complete! Ready to work on Nested If assignments."
else
    echo "❌ Setup failed. Check your Java installation and Maven configuration."
    exit 1
fi
