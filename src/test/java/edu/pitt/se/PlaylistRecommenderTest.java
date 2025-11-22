package edu.pitt.se;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {
    @Test
    void testClassifyEnergyHigh() {
        assertEquals("HIGH",PlaylistRecommender.classifyEnergy(Arrays.asList(150, 145)));
    }

    
    void testClassifyEnergyMedium() {
        assertEquals("MEDIUM",PlaylistRecommender.classifyEnergy(Arrays.asList(110, 100)));
    }

    
    void testClassifyEnergyLow() {
        assertEquals("LOW",PlaylistRecommender.classifyEnergy(Arrays.asList(80, 90)));
    }

    
    void testClassifyEnergyNull() {
        assertThrows(IllegalArgumentException.class, () -> {PlaylistRecommender.classifyEnergy(null);
        });
    }

    
    void testValidTrackTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Hello World"));
    }

    
    void testInvalidTrackTitleSpecialChars() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("Love!!!"));
    }

    
    void testNormalizeVolumeUpperBound() {
        assertEquals(100,PlaylistRecommender.normalizeVolume(150));
    }

    
    void testNormalizeVolumeLowerBound() {
        assertEquals(0,PlaylistRecommender.normalizeVolume(-20));
    }
}

