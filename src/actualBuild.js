userWorkout.html.getElementById('workoutForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Get user's preferences from the form fields
    const exerciseType = document.getElementById('exerciseType').value;
    const intensity = document.getElementById('intensity').value;
    const targets = document.getElementById('targets').value;
    const time = document.getElementById('time').value;

    // Create a Preferences object with the user's preferences
    const preferences = new Preferences(exerciseType, intensity, targets, time);

    // Create a CreateWorkout object with the user and preferences
    const createWorkout = new CreateWorkout(user, preferences);

    // Generate the workout routine
    const workoutRoutine = createWorkout.makeWorkoutRoutine();

    // Display the workout routine on the page or take any other actions
    userWorkout.html.getElementById('workoutOutput').innerHTML = workoutRoutine.toString();
});