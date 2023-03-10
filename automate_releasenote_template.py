import datetime

# Function to generate the release note
def generate_release_note(version_number, new_features, enhancements, bug_fixes, known_issues, installation_instructions, compatibility, other_notes):
    release_date = datetime.date.today().strftime("%Y-%m-%d")
    software_name = "Your Automotive Software Name"
    release_note = f"Release Note Template for {software_name}:\n\n"
    release_note += f"Version Number: {version_number}\n"
    release_note += f"Release Date: {release_date}\n"
    release_note += f"Software Name: {software_name}\n\n"
    release_note += "New Features:\n"
    for feature in new_features:
        release_note += f"- {feature}\n"
    release_note += "\nEnhancements:\n"
    for enhancement in enhancements:
        release_note += f"- {enhancement}\n"
    release_note += "\nBug Fixes:\n"
    for bug in bug_fixes:
        release_note += f"- {bug}\n"
    release_note += "\nKnown Issues:\n"
    for issue in known_issues:
        release_note += f"- {issue}\n"
    release_note += "\nInstallation Instructions:\n"
    for instruction in installation_instructions:
        release_note += f"- {instruction}\n"
    release_note += f"\nCompatibility: {compatibility}\n"
    release_note += f"\nOther Notes: {other_notes}\n"
    release_note += "\nContact Information:\n"
    release_note += "- Insert contact information for technical support here\n"
    return release_note

# Sample input data
version_number = "1.2.3"
new_features = ["Added feature A", "Added feature B"]
enhancements = ["Enhanced feature X", "Enhanced feature Y"]
bug_fixes = ["Fixed issue 1", "Fixed issue 2"]
known_issues = ["Known issue A", "Known issue B"]
installation_instructions = ["Step 1: Download the software from our website", "Step 2: Install the software"]
compatibility = "Compatible with Windows 10 and Mac OS 11.0"
other_notes = "No additional notes"

# Generate the release note
release_note = generate_release_note(version_number, new_features, enhancements, bug_fixes, known_issues, installation_instructions, compatibility, other_notes)

# Print the release note
print(release_note)

# You can modify the output to write the release note to a file or send it via email, depending on your needs.
