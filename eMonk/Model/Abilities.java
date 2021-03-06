package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Joseph18 on 12/8/2014.
 */
public class Abilities {
    private HashMap<Integer, Ability> abilityList;

    public Abilities(){
        abilityList = new HashMap<Integer, Ability>();
        setAbilityList();

    }

    public String getName(int id){
        return abilityList.get(id).getName();
    }

    public int getAdrenaline(int id){
        return abilityList.get(id).getAdrenaline();
    }

    private void setAbilityList(){
        // Strength
        abilityList.put(113, new Ability(113, "Slaughter", 50, Ability.AbilityType.Strength));
        abilityList.put(17, new Ability(17, "Slice", 0, Ability.AbilityType.Strength));
        abilityList.put(161, new Ability(161, "Overpower", 100, Ability.AbilityType.Strength));
        abilityList.put(65, new Ability(65, "Havoc", 0, Ability.AbilityType.Strength));
        abilityList.put(97, new Ability(97, "Backhand", 0, Ability.AbilityType.Strength));
        abilityList.put(257, new Ability(257, "Forceful Backhand", 50, Ability.AbilityType.Strength));
        abilityList.put(81, new Ability(81, "Smash", 0, Ability.AbilityType.Strength));
        abilityList.put(33, new Ability(33, "Barge", 0, Ability.AbilityType.Strength));
        abilityList.put(129, new Ability(129, "Flurry", 50, Ability.AbilityType.Strength));
        abilityList.put(49, new Ability(49, "Sever", 0, Ability.AbilityType.Strength));
        abilityList.put(145, new Ability(145, "Hurricane", 50, Ability.AbilityType.Strength));
        abilityList.put(177, new Ability(177, "Massacre", 100, Ability.AbilityType.Strength));
        abilityList.put(193, new Ability(193, "Meteor Strike", 100, Ability.AbilityType.Strength));
        // Attack
        abilityList.put(210, new Ability(210, "Stomp", 0, Ability.AbilityType.Attack));
        abilityList.put(34, new Ability(34, "Kick", 50, Ability.AbilityType.Attack));
        abilityList.put(50, new Ability(50, "Punish", 50, Ability.AbilityType.Attack));
        abilityList.put(18, new Ability(18, "Dismember", 50, Ability.AbilityType.Attack));
        abilityList.put(66, new Ability(66, "Fury", 50, Ability.AbilityType.Attack));
        abilityList.put(146, new Ability(146, "Destroy", 50, Ability.AbilityType.Attack));
        abilityList.put(130, new Ability(130, "Quake", 50, Ability.AbilityType.Attack));
        abilityList.put(162, new Ability(162, "Berserk", 100, Ability.AbilityType.Attack));
        abilityList.put(98, new Ability(98, "Cleave", 0, Ability.AbilityType.Attack));
        abilityList.put(114, new Ability(114, "Assault", 50, Ability.AbilityType.Attack));
        abilityList.put(82, new Ability(82, "Decimate", 0, Ability.AbilityType.Attack));
        abilityList.put(194, new Ability(194, "Pulverise", 100, Ability.AbilityType.Attack));
        abilityList.put(178, new Ability(178, "Frenzy", 100, Ability.AbilityType.Attack));
        // Defence
        abilityList.put(19, new Ability(19, "Anticipation", 0, Ability.AbilityType.Defence));
        abilityList.put(99, new Ability(99, "Bash", 0, Ability.AbilityType.Defence));
        abilityList.put(147, new Ability(147, "Revenge", 50, Ability.AbilityType.Defence));
        abilityList.put(51, new Ability(51, "Provoke", 0, Ability.AbilityType.Defence));
        abilityList.put(195, new Ability(195, "Immortality", 100, Ability.AbilityType.Defence));
        abilityList.put(35, new Ability(35, "Freedom", 0, Ability.AbilityType.Defence));
        abilityList.put(115, new Ability(115, "Reflect", 50, Ability.AbilityType.Defence));
        abilityList.put(67, new Ability(67, "Resonance", 0, Ability.AbilityType.Defence));
        abilityList.put(179, new Ability(179, "Rejuvenate", 100, Ability.AbilityType.Defence));
        abilityList.put(131, new Ability(131, "Debilitate", 50, Ability.AbilityType.Defence));
        abilityList.put(83, new Ability(83, "Preparation", 0, Ability.AbilityType.Defence));
        abilityList.put(163, new Ability(163, "Barricade", 100, Ability.AbilityType.Defence));
        // Constitution
        abilityList.put(114, new Ability(114, "Weapon Special Attack", 0, Ability.AbilityType.Constitution));
        abilityList.put(82, new Ability(82, "Regenerate", 0, Ability.AbilityType.Constitution));
        abilityList.put(194, new Ability(194, "Siphon", 0, Ability.AbilityType.Constitution));
        abilityList.put(36, new Ability(36, "Incite", 0, Ability.AbilityType.Constitution));
        // Ranged
        abilityList.put(21, new Ability(21, "Piercing Shot", 0, Ability.AbilityType.Ranged));
        abilityList.put(117, new Ability(117, "Snap Shot", 50, Ability.AbilityType.Ranged));
        abilityList.put(197, new Ability(197, "Deadshot", 100, Ability.AbilityType.Ranged));
        abilityList.put(69, new Ability(69, "Snipe", 0, Ability.AbilityType.Ranged));
        abilityList.put(245, new Ability(245, "Dazing Shot", 0, Ability.AbilityType.Ranged));
        abilityList.put(37, new Ability(37, "Binding Shot", 0, Ability.AbilityType.Ranged));
        abilityList.put(261, new Ability(261, "Needle Strike", 0, Ability.AbilityType.Ranged));
        abilityList.put(293, new Ability(293, "Tight Bindings", 50, Ability.AbilityType.Ranged));
        abilityList.put(85, new Ability(85, "Fragmentation Shot", 0, Ability.AbilityType.Ranged));
        abilityList.put(53, new Ability(53, "Escape", 0, Ability.AbilityType.Ranged));
        abilityList.put(133, new Ability(133, "Rapid Fire", 50, Ability.AbilityType.Ranged));
        abilityList.put(101, new Ability(101, "Ricochet", 0, Ability.AbilityType.Ranged));
        abilityList.put(149, new Ability(149, "Bombardment", 50, Ability.AbilityType.Ranged));
        abilityList.put(165, new Ability(165, "Incendiary Shot", 100, Ability.AbilityType.Ranged));
        abilityList.put(181, new Ability(181, "Unload", 100, Ability.AbilityType.Ranged));
        // Mage
        abilityList.put(118, new Ability(118, "Asphyxiate", 50, Ability.AbilityType.Magic));
        abilityList.put(22, new Ability(22, "Wrack", 0, Ability.AbilityType.Magic));
        abilityList.put(198, new Ability(198, "Omnipower", 100, Ability.AbilityType.Magic));
        abilityList.put(102, new Ability(102, "Dragon Breath", 0, Ability.AbilityType.Magic));
        abilityList.put(2646, new Ability(2646, "Sonic Wave", 0, Ability.AbilityType.Magic));
        abilityList.put(54, new Ability(54, "Impact", 0, Ability.AbilityType.Magic));
        abilityList.put(2662, new Ability(2662, "Concentrated Blast", 0, Ability.AbilityType.Magic));
        abilityList.put(2742, new Ability(2742, "Deep Impact", 50, Ability.AbilityType.Magic));
        abilityList.put(86, new Ability(86, "Combust", 0, Ability.AbilityType.Magic));
        abilityList.put(38, new Ability(38, "Surge", 0, Ability.AbilityType.Magic));
        abilityList.put(134, new Ability(134, "Detonate", 50, Ability.AbilityType.Magic));
        abilityList.put(70, new Ability(70, "Chain", 0, Ability.AbilityType.Magic));
        abilityList.put(150, new Ability(150, "Wild Magic", 50, Ability.AbilityType.Magic));
        abilityList.put(166, new Ability(166, "Metamorphosis", 100, Ability.AbilityType.Magic));
        abilityList.put(182, new Ability(182, "Tsunami", 100, Ability.AbilityType.Magic));
    }
}
