package Model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RoomType {
	SMOKING, NON_SMOKING;

	private static final List<RoomType> VALUES = Collections
			.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static RoomType randomRoomType() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
