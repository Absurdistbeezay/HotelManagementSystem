package Model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum BedSize {
	TWIN, QUEEN, KING, HONEY_MOON;
	
	private static final List<BedSize> VALUES = Collections
			.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static BedSize randomBedSize() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
