/*******************************************************************************
 * Copyright 2014-2019, the Biomes O' Plenty Team
 *
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 *
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/
package biomesoplenty.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.PlantType;

public class DoublePlantBlockBOP extends DoublePlantBlock
{
    public DoublePlantBlockBOP(Block.Properties properties)
    {
        super(properties);
    }

    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos)
    {
        return PlantType.Plains;
    }
}
