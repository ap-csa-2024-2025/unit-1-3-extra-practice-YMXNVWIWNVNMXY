[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=15798599)
# 1-3-extra-practice
Problems from CodeHS Unit 1.3 for AP CSA Nitro

## Pyramid
Write a program that estimates how much Kufu’s pyramid in Giza weighs.

Your program should assume that every block weighs 2.5 tons. Kufu’s pyramid in Giza used around 2,500,000 blocks.

You should use two variables, `numBlocks` and `blockWeight`, to calculate the weight.

Here is an example output for a pyramid that uses 150,000 blocks:
```
The pyramid weighs 375000.0 tons
```
Note: Your number should be different!

## Fractions
In this program you will initialize 4 integers that represent each part of two fractions, namely the numerator and denominator of the first fraction and the numerator and denominator of the second fraction.

Your program should add the two fractions and print out the result.

For example, a sample program run might look like this
```
The numerator of the first fraction is 1
The denominator of the first fraction is 2
The numerator of the second fraction is 2
The denominator of the second fraction is 5
The sum of 1/2 + 2/5 = 9/10
```
Note: you do not need to reduce these fractions. Be sure to test your code for positive and negative integers by changing the values of your initialized variables.

Remember, if you have two fractions you add them with:

$$ \dfrac{a}{b} + \dfrac{c}{d} = \dfrac{ad + bc}{bd} $$

## Gravity
A free fall is when an object is falling freely with no forces acting upon it except gravity, which creates a constant acceleration of g = 9.8 m/s2. The distance the object falls (height in meters) in time is:

$$h = 0.5 \cdot g \cdot t^2$$

where h is height in meters, g is the gravitational acceleration constant (9.8 m/s^2), and t is the time the object has been in the air in seconds.

The object’s velocity (meters per second) over time of the fall is defined as:

$$ v = g \cdot t $$

where v is velocity in meters / second, g is the gravitational acceleration constant (9.8 m/s^2), and t is the time the object has been in the air in seconds.

Use g as a `final` variable to solve the following problems in Java.

1. You’re standing at the edge of a cliff and drop a ball. It takes 23 sec to hit the ground. How high up are you? In other words, what’s the height of the cliff?
2. What is the velocity of the ball when it hits the ground?

Print the height and then the velocity. Format your answers so that the numbers have units and meaning in a sentence.

A sample output looks like:
```
The height of the cliff is 99 m.
The final velocity of the ball is 99 m/s.
```
Once you get your program working properly, try to reset the final g variable and the t variable to something different before you do the calculations in the formulas in your program. What happens in each case?
