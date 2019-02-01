# PizzaShop

The implementation is rather simplistic due to the lack of details.

Most certainly this exercise was meant to be performed together with the assessor with the purpose to have an actual conversation and have questions being put. This is what would actually give the evaluator insights to the interviewe knowledge and not the actual code.

Discussion would revolve around topics such as:
- can more ingredients be added to the shop's inventory
- what happends with, for example, Meat Feast pizza when another ingredient of type Meat is added, should the pizza contain the type as well?
- what is actually understood by a customer being able to pay for the order
- how is the price of the order calculated
- the modeling of the order in a real life scenario would be considerably different, aspects such as persistence of data and the evolution of data in time would require having more details about each and every pizza, because the receipe for a certain pizza might change and an order should show always the same receipe as when it was ordered
- while core data is what should be kept everytime at the model level, real life scenarios require also aggregation of data and in such a case, for example, an order would be modeled to also have a price, you don't want to calculate the price everytime the order is read.
