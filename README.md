# Hero-Stat-Planner

This is a simple command line program that lets you plan out the various attributes for characters in the popular video game
Phantasy Star Online.

You will navigate through various menus and first select your character, and then separate menus for various different sources
of attribute bonuses: units, materials, mag, armor, and shield.

The program uses inheritance to change the base and maximum stats based on what character you choose, as well as impose
strict limits, like androids not being able to get mind strength (they can't use magic!);
The program also does not allow you to select more material or mag points than you have left, though you can reset those values
if you choose to start over.
And of course, material points are different for androids than humans, and so inheritance morphs those values when the character selection changes!

Encapsilation was essential to helping store and retrieve the various attributes that are specific to that character,
whether their current equipped unit, or current material points spent.
Storing how many points were spent for consumable materials or mag levels also helped make sure you couldn't go over native limits.

Finally, unit testing was employed not just for the various methods related to characters and their attribute calculations, but
also proper menuing logic, so if an invalid input was chosen, the menu would display the error, and re-display the menu
