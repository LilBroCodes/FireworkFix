package dev.cammiescorner.fireworkfrenzy.integration;

import dev.cammiescorner.fireworkfrenzy.FireworkFrenzy;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = FireworkFrenzy.MOD_ID)
public class FireworkFrenzyConfig implements ConfigData {
	@Comment("Number of Invincibility Ticks when a player hits themselves" +
			"\n    with a Firework Rocket? (Vanilla: 10)")
	public int selfDamageInvincibilityTicks = 0;

	@Comment("Base damage of Firework Rockets.")
	public float baseDamage = 3F;

	@Comment("Multiplier for Rocket Jump Velocity.")
	public double rocketJumpMultiplier = 1D;

	@Comment("Multiplier for other entity's Firework Rocket Knockback")
	public double otherEntityKnockback = 0.5D;

	@Comment("Should item display damage of Firework Rockets?")
	public boolean showTooltip = true;

	@Comment("Should damage scaling only affect Crossbows?")
	public boolean onlyAffectCrossbows = true;

	@Comment("Should players be able to Rocket Jump?")
	public boolean allowRocketJumping = true;

	@Comment("Should the <insert shovel name> be added to the game?" +
			"\n    (Restart Required)")
	public boolean enableMemeSpoon = true;

	@Comment("Should the <insert boots name> be added to the game?" +
			"\n    (Restart Required)")
	public boolean enableGunboats = true;

	@Comment("Should players be able to use Firework Rockets from their" +
			"\n    inventory, and not just their offhand?")
	public boolean useRocketsFromInv = true;

	@Comment("Should Elytra flight cancel Rocket Jumping?" +
			"\n    (Overwrites Firework Boost option if true)")
	public boolean elytrasCancelRocketJumping = true;

	@Comment("Should Firework Boosts cancel Rocket Jumping?")
	public boolean boostsCancelRocketJumping = true;

	@Comment("Should Crossbows get Infinity?")
	public boolean crossbowsGetInfinity = true;
}
