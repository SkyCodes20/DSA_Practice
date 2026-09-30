package Project;

public class Task {
        private String name;
        private boolean done;

        public Task(String name) {
            this.name = name;
            this.done = false;
        }

        public String getName() { return name; }
        public boolean isDone() { return done; }
        public void markDone() { done = true; }

        @Override
        public String toString() {
            return (done ? "[X] " : "[ ] ") + name;
        }
    }

