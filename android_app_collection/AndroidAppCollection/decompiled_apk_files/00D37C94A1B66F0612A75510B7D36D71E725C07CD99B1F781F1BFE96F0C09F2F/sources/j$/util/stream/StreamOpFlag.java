package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;
/* JADX WARN: Init of enum DISTINCT can be incorrect */
/* JADX WARN: Init of enum ORDERED can be incorrect */
/* JADX WARN: Init of enum SHORT_CIRCUIT can be incorrect */
/* JADX WARN: Init of enum SIZED can be incorrect */
/* JADX WARN: Init of enum SORTED can be incorrect */
/* loaded from: classes5.dex */
enum StreamOpFlag {
    DISTINCT(0, r2.setAndClear(r4)),
    SORTED(1, set(r1).set(r3).setAndClear(r4)),
    ORDERED(2, r6.clear(r8)),
    SIZED(3, set(r1).set(r3).clear(r4)),
    SHORT_CIRCUIT(12, set(r4).set(r7));
    
    private static final int FLAG_MASK;
    private static final int FLAG_MASK_IS;
    private static final int FLAG_MASK_NOT;
    static final int INITIAL_OPS_VALUE;
    static final int IS_ORDERED;
    static final int IS_SHORT_CIRCUIT;
    static final int IS_SIZED;
    static final int NOT_DISTINCT;
    static final int NOT_ORDERED;
    static final int NOT_SIZED;
    static final int NOT_SORTED;
    static final int OP_MASK;
    static final int SPLITERATOR_CHARACTERISTICS_MASK;
    static final int STREAM_MASK;
    private final int bitPosition;
    private final int clear;
    private final Map maskTable;
    private final int preserve;
    private final int set;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum Type {
        SPLITERATOR,
        STREAM,
        OP,
        TERMINAL_OP,
        UPSTREAM_TERMINAL_OP
    }

    static {
        StreamOpFlag streamOpFlag;
        StreamOpFlag streamOpFlag2;
        StreamOpFlag streamOpFlag3;
        Type type = Type.SPLITERATOR;
        MaskBuilder maskBuilder = set(type);
        Type type2 = Type.STREAM;
        maskBuilder.set(type2);
        Type type3 = Type.OP;
        MaskBuilder andClear = set(type).set(type2).setAndClear(type3);
        Type type4 = Type.TERMINAL_OP;
        andClear.clear(type4);
        Type type5 = Type.UPSTREAM_TERMINAL_OP;
        StreamOpFlag streamOpFlag4 = ORDERED;
        StreamOpFlag streamOpFlag5 = SIZED;
        SPLITERATOR_CHARACTERISTICS_MASK = createMask(type);
        int createMask = createMask(type2);
        STREAM_MASK = createMask;
        OP_MASK = createMask(type3);
        createMask(type4);
        createMask(type5);
        FLAG_MASK = createFlagMask();
        FLAG_MASK_IS = createMask;
        int i = createMask << 1;
        FLAG_MASK_NOT = i;
        INITIAL_OPS_VALUE = createMask | i;
        NOT_DISTINCT = streamOpFlag.clear;
        NOT_SORTED = streamOpFlag2.clear;
        IS_ORDERED = streamOpFlag4.set;
        NOT_ORDERED = streamOpFlag4.clear;
        IS_SIZED = streamOpFlag5.set;
        NOT_SIZED = streamOpFlag5.clear;
        IS_SHORT_CIRCUIT = streamOpFlag3.set;
    }

    private static MaskBuilder set(Type type) {
        return new MaskBuilder(new EnumMap(Type.class)).set(type);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class MaskBuilder {
        final Map map;

        MaskBuilder(Map map) {
            this.map = map;
        }

        MaskBuilder mask(Type type, Integer num) {
            this.map.put(type, num);
            return this;
        }

        MaskBuilder set(Type type) {
            return mask(type, 1);
        }

        MaskBuilder clear(Type type) {
            return mask(type, 2);
        }

        MaskBuilder setAndClear(Type type) {
            return mask(type, 3);
        }

        Map build() {
            for (Type type : Type.values()) {
                Map.EL.putIfAbsent(this.map, type, 0);
            }
            return this.map;
        }
    }

    StreamOpFlag(int i, MaskBuilder maskBuilder) {
        this.maskTable = maskBuilder.build();
        int i2 = i * 2;
        this.bitPosition = i2;
        this.set = 1 << i2;
        this.clear = 2 << i2;
        this.preserve = 3 << i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isKnown(int i) {
        return (i & this.preserve) == this.set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPreserved(int i) {
        int i2 = this.preserve;
        return (i & i2) == i2;
    }

    private static int createMask(Type type) {
        StreamOpFlag[] values;
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= ((Integer) streamOpFlag.maskTable.get(type)).intValue() << streamOpFlag.bitPosition;
        }
        return i;
    }

    private static int createFlagMask() {
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= streamOpFlag.preserve;
        }
        return i;
    }

    private static int getMask(int i) {
        if (i == 0) {
            return FLAG_MASK;
        }
        return (((i & FLAG_MASK_NOT) >> 1) | (((FLAG_MASK_IS & i) << 1) | i)) ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int combineOpFlags(int i, int i2) {
        return i | (i2 & getMask(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toStreamFlags(int i) {
        return i & ((i ^ (-1)) >> 1) & FLAG_MASK_IS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toCharacteristics(int i) {
        return i & SPLITERATOR_CHARACTERISTICS_MASK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fromCharacteristics(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        if ((characteristics & 4) != 0 && spliterator.getComparator() != null) {
            return SPLITERATOR_CHARACTERISTICS_MASK & characteristics & (-5);
        }
        return SPLITERATOR_CHARACTERISTICS_MASK & characteristics;
    }
}
