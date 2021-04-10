package testtask.three;

import by.andersen.alkhovik.testtask.three.logic.ThreeUtils;

public class Runner {

    public static void main(String[] args) {
        ThreeUtils utils = new ThreeUtils();
        System.out.println(utils.multipleOfThree(utils.input()));
    }
}
