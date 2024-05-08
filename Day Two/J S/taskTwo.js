const prompt = require("prompt-sync")();
let scores = [ ];
for (let index = 0; index < 10; index++){
	let score = parseInt(prompt("Enter score " + (index+1) + ": "));
	scores.append(parseInt(score));

}
console.log("Scores: ", scores)



