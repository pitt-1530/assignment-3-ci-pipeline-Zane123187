package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("BPM list cannot be null or empty");
        }

        int sum = 0;
        for (int bpm : bpms) {
            sum += bpm;
        }
        double avg = sum / (double) bpms.size();

        if (avg >= 140) {
            return "HIGH";
        } else if (avg >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        if (title == null) return false;
        if (title.length() < 1 || title.length() > 30) return false;
        return title.matches("[A-Za-z ]+");
        
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if (volumeDb < 0) return 0;
        if (volumeDb > 100) return 100;
        return volumeDb;
    }
}
