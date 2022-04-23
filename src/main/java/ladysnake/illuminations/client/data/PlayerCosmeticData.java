package ladysnake.illuminations.client.data;

import com.google.gson.JsonElement;

public class PlayerCosmeticData {
    private final int red;
    private final int green;
    private final int blue;
    private String aura;
    private String overhead;
    private boolean drip;
    private String pet;

    public PlayerCosmeticData(JsonElement aura, JsonElement color, JsonElement overhead, JsonElement drip, JsonElement pet) {
        if (aura.isJsonNull()) {
            this.aura = null;
        } else {
            this.aura = aura.getAsString();
        }
        if (color.isJsonNull()) {
            this.red = 0;
            this.green = 0;
            this.blue = 0;
        } else {
            this.red = Integer.valueOf(color.getAsString().substring(1, 3), 16);
            this.green = Integer.valueOf(color.getAsString().substring(3, 5), 16);
            this.blue = Integer.valueOf(color.getAsString().substring(5), 16);
        }
        if (overhead.isJsonNull()) {
            this.overhead = null;
        } else {
            this.overhead = overhead.getAsString();
        }
        if (pet.isJsonNull()) {
            this.pet = null;
        } else {
            this.pet = pet.getAsString();
        }
        if (drip.isJsonNull()) {
            this.drip = false;
        } else {
            this.drip = drip.getAsBoolean();
        }
    }

    public String getAura() {
        return aura;
    }

    public int getred() {
        return red;
    }

    public int getblue() {
        return blue;
    }

    public int getgreen() {
        return green;
    }

    public boolean isDrip() {
        return drip;
    }

    public String getOverhead() {
        return overhead;
    }

    public String getPet() {
        return pet;
    }
}
