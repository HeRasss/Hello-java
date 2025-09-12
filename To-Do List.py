def main():
    tasks = []
    print("Welcome to the To-Do List program!")

    while True:
        command = input("\nEnter command (add, list, remove, exit): ").lower().strip()

        if command.startswith("add "):
            task = command[4:].strip()
            if task:
                tasks.append(task)
                print(f"Task \"{task}\" added.")
            else:
                print("Please provide a task to add.")
        elif command == "list":
            if not tasks:
                print("No tasks in the list.")
            else:
                print("\nYour To-Do List:")
                for i, task in enumerate(tasks, 1):
                    print(f"{i}. {task}")
        elif command.startswith("remove "):
            try:
                task_num_str = command[7:].strip()
                task_num = int(task_num_str)
                if 1 <= task_num <= len(tasks):
                    removed_task = tasks.pop(task_num - 1)
                    print(f"Task \"{removed_task}\" removed.")
                else:
                    print("Invalid task number. Please enter a number from the list.")
            except ValueError:
                print("Invalid command. Please specify a task number after 'remove'.")
        elif command == "exit":
            print("Exiting To-Do List program. Goodbye!")
            break
        else:
            print("Invalid command. Please use 'add <task>', 'list', 'remove <number>', or 'exit'.")

if __name__ == "__main__":
    main()
