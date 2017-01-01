package techreborn.itemblocks;

import net.minecraft.block.Block;
import reborncore.common.itemblock.ItemBlockBase;
import techreborn.blocks.BlockPlayerDetector;
import techreborn.init.ModBlocks;

public class ItemBlockPlayerDetector extends ItemBlockBase {
	public ItemBlockPlayerDetector(Block block) {
		super(ModBlocks.PLAYER_DETECTOR, ModBlocks.PLAYER_DETECTOR, BlockPlayerDetector.types);
	}
}
