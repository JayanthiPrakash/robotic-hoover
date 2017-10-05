package com.yoti.robotichoover;

import java.util.List;

public class HooverInput {
    private List<Integer> roomSize = null;
    private List<Integer> coords = null;
    private List<List<Integer>> patches = null;
    private String instructions;

//    public HooverInput(List<Integer> roomSize, List<Integer> coords, List<List<Integer>> patches, String instructtions){
//        this.roomSize = roomSize;
//        this.coords = coords;
//        this.patches = patches;
//        this.instructions = instructtions;
//    }

    public List<Integer> getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(List<Integer> roomSize) {
        this.roomSize = roomSize;
    }

    public List<Integer> getCoords() {
        return coords;
    }

    public void setCoords(List<Integer> coords) {
        this.coords = coords;
    }

    public List<List<Integer>> getPatches() {
        return patches;
    }

    public void setPatches(List<List<Integer>> patches) {
        this.patches = patches;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString()
    {
        return "HooverInput [patches = "+patches+", coords = "+coords+", instructions = "+instructions+", roomSize = "+roomSize+"]";
    }
}
