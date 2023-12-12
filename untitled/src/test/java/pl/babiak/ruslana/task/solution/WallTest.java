package pl.babiak.ruslana.task.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    @Test
    void findBlockByColor() {
        //given
        Wall wall = new Wall();

        //when
        Optional<Block> redBlock = wall.findBlockByColor("RED");

        //then
        Assertions.assertNotNull(redBlock, "Block not found with mentioned color.");
    }

    @Test
    void findBlocksByMaterial() {
        //given
        Wall wall = new Wall();

        //when
        List<Block> woodBlock = wall.findBlocksByMaterial("WOOD");

        //then
        Assertions.assertNotNull(woodBlock, "Block not found with mentioned material.");
    }

    @Test
    void count() {
        //given
        Wall wall = new Wall();

        //when
        int wallCount = wall.count();

        int negative = 0;

        if(wallCount < negative){
            negative = wallCount;
        }

        //then
        Assertions.assertNotEquals(negative, wallCount);
    }

    @Test
    void getColor() {
        //given
        Wall wall = new Wall();

        //when
        String color = wall.getColor();

        //then
        Assertions.assertNotNull(color, "Wall does not exist with mentioned color " + color + ".");
    }

    @Test
    void getMaterial() {
        //given
        Wall wall = new Wall();

        //when
        String material = wall.getMaterial();

        //then
        Assertions.assertNotNull(material, "Wall does not exist with mentioned material " + material + ".");
    }

    @Test
    void getBlocks() {
        //given
        Wall wall = new Wall();

        //when
        List<Block> blocks = wall.getBlocks();

        //then
        Assertions.assertNotNull(blocks, "List is empty.");
    }
}