def check_message(password, message):

    message_lower = message.lower()
    password_lower = password.lower()
    password_index = 0


    for letter in message_lower:
        if letter == password_lower[password_index]:
            password_index += 1
            if password_index == len(password_lower):
                return "PASS"
        else:
            if letter in password_lower[password_index:]:
                return "FAIL"
    return "FAIL" if password_index < len(password_lower) else "PASS"

def main():
    password, message = input().split()
    result = check_message(password, message)
    print(result)

if __name__ == "__main__":
    main()


