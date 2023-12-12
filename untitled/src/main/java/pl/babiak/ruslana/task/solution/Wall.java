package pl.babiak.ruslana.task.solution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure, CompositeBlock {
    private List<Block> blockList;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for (Block block : blockList) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blockList
                .stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blockList.size();
    }

    @Override
    public String getColor() {
        for (Block block : blockList) {
            return block.getColor();
        }
        return null;
    }

    @Override
    public String getMaterial() {
        for (Block block : blockList) {
            return block.getMaterial();
        }
        return null;
    }

    @Override
    public List<Block> getBlocks() {
        return blockList;
    }
}
