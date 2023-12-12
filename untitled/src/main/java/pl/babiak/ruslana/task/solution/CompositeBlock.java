package pl.babiak.ruslana.task.solution;

import java.util.List;

public interface CompositeBlock extends Block{
    List<Block> getBlocks();
}
