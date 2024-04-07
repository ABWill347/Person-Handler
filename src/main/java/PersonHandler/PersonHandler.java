package PersonHandler;

public class PersonHandler {
        private final Person[] personArray;

        public PersonHandler(Person[] personArray) {
            this.personArray = personArray;
        }

        // NOTICE how the comments can be used to step-by-step break down the problem into
        // simple lines of code...

        public String whileLoop() {
            String result = "";
            int counter=0;// create a `counter`
            while(counter < personArray.length){// while `counter` is less than length of array
                // begin loop
                Person currentPerson = personArray[counter];// use `counter` to identify the `current Person` in the array
                String stringRepresentation = currentPerson.getName(); // get `string Representation` of `currentPerson`
                result += stringRepresentation;// append `stringRepresentation` to `result` variable
                counter++;
            }
            return result; // end loop

        }

        public String forLoop() {
            String result = "";
            // identify initial value
            // identify terminal condition
            // identify increment
            for (int counter = 0; counter < personArray.length; counter++) {// use the above clauses to declare for-loop signature
                // begin loop
                Person currentPerson = personArray[counter];// use `counter` to identify the `current Person` in the array
                String Representation= currentPerson.getName();// get `string Representation` of `currentPerson`
                result += Representation;// append `stringRepresentation` to `result` variable
                // end loop

            }return result;
        }
        public String forEachLoop() {
            String result = "";
            // identify array's type
            // identify array's variable-name
            for (Person currentPerson : personArray) {  // use the above discoveries to declare for-each-loop signature
                // begin loop
                String stringRepresentation = currentPerson.getName();// get `string Representation` of `currentPerson`
                result += stringRepresentation;// append `stringRepresentation` to `result` variable
                // end loop
            }return result;

        }

        public Person[] getPersonArray() {
            return personArray;
        }
    }