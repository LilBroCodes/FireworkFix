package dev.cammiescorner.fireworkfrenzy.entities;

import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.world.World;

import java.util.List;

public class DamageCloudEntity extends AreaEffectCloudEntity {
	public DamageCloudEntity(EntityType<? extends AreaEffectCloudEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public void tick() {
		super.tick();

		List<LivingEntity> affectedEntities = getWorld().getNonSpectatingEntities(LivingEntity.class, getBoundingBox());

		for(LivingEntity target : affectedEntities) {
			if (age % 10 == 0) {
				target.damage(getDamageSources().explosion(this, getOwner()), 4);
			}
		}
	}

	@Override
	public EntityDimensions getDimensions(EntityPose pose) {
		return EntityDimensions.changing(getRadius() * 2, getRadius() * 2);
	}
}
