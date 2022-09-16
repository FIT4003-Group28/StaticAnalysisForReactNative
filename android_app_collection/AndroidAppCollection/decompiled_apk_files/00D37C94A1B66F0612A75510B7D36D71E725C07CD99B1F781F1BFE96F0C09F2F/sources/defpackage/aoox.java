package defpackage;
/* compiled from: PG */
/* renamed from: aoox  reason: default package */
/* loaded from: classes.dex */
public enum aoox {
    DOUBLE(0, aoow.SCALAR, aopz.DOUBLE),
    FLOAT(1, aoow.SCALAR, aopz.FLOAT),
    INT64(2, aoow.SCALAR, aopz.LONG),
    UINT64(3, aoow.SCALAR, aopz.LONG),
    INT32(4, aoow.SCALAR, aopz.INT),
    FIXED64(5, aoow.SCALAR, aopz.LONG),
    FIXED32(6, aoow.SCALAR, aopz.INT),
    BOOL(7, aoow.SCALAR, aopz.BOOLEAN),
    STRING(8, aoow.SCALAR, aopz.STRING),
    MESSAGE(9, aoow.SCALAR, aopz.MESSAGE),
    BYTES(10, aoow.SCALAR, aopz.BYTE_STRING),
    UINT32(11, aoow.SCALAR, aopz.INT),
    ENUM(12, aoow.SCALAR, aopz.ENUM),
    SFIXED32(13, aoow.SCALAR, aopz.INT),
    SFIXED64(14, aoow.SCALAR, aopz.LONG),
    SINT32(15, aoow.SCALAR, aopz.INT),
    SINT64(16, aoow.SCALAR, aopz.LONG),
    GROUP(17, aoow.SCALAR, aopz.MESSAGE),
    DOUBLE_LIST(18, aoow.VECTOR, aopz.DOUBLE),
    FLOAT_LIST(19, aoow.VECTOR, aopz.FLOAT),
    INT64_LIST(20, aoow.VECTOR, aopz.LONG),
    UINT64_LIST(21, aoow.VECTOR, aopz.LONG),
    INT32_LIST(22, aoow.VECTOR, aopz.INT),
    FIXED64_LIST(23, aoow.VECTOR, aopz.LONG),
    FIXED32_LIST(24, aoow.VECTOR, aopz.INT),
    BOOL_LIST(25, aoow.VECTOR, aopz.BOOLEAN),
    STRING_LIST(26, aoow.VECTOR, aopz.STRING),
    MESSAGE_LIST(27, aoow.VECTOR, aopz.MESSAGE),
    BYTES_LIST(28, aoow.VECTOR, aopz.BYTE_STRING),
    UINT32_LIST(29, aoow.VECTOR, aopz.INT),
    ENUM_LIST(30, aoow.VECTOR, aopz.ENUM),
    SFIXED32_LIST(31, aoow.VECTOR, aopz.INT),
    SFIXED64_LIST(32, aoow.VECTOR, aopz.LONG),
    SINT32_LIST(33, aoow.VECTOR, aopz.INT),
    SINT64_LIST(34, aoow.VECTOR, aopz.LONG),
    DOUBLE_LIST_PACKED(35, aoow.PACKED_VECTOR, aopz.DOUBLE),
    FLOAT_LIST_PACKED(36, aoow.PACKED_VECTOR, aopz.FLOAT),
    INT64_LIST_PACKED(37, aoow.PACKED_VECTOR, aopz.LONG),
    UINT64_LIST_PACKED(38, aoow.PACKED_VECTOR, aopz.LONG),
    INT32_LIST_PACKED(39, aoow.PACKED_VECTOR, aopz.INT),
    FIXED64_LIST_PACKED(40, aoow.PACKED_VECTOR, aopz.LONG),
    FIXED32_LIST_PACKED(41, aoow.PACKED_VECTOR, aopz.INT),
    BOOL_LIST_PACKED(42, aoow.PACKED_VECTOR, aopz.BOOLEAN),
    UINT32_LIST_PACKED(43, aoow.PACKED_VECTOR, aopz.INT),
    ENUM_LIST_PACKED(44, aoow.PACKED_VECTOR, aopz.ENUM),
    SFIXED32_LIST_PACKED(45, aoow.PACKED_VECTOR, aopz.INT),
    SFIXED64_LIST_PACKED(46, aoow.PACKED_VECTOR, aopz.LONG),
    SINT32_LIST_PACKED(47, aoow.PACKED_VECTOR, aopz.INT),
    SINT64_LIST_PACKED(48, aoow.PACKED_VECTOR, aopz.LONG),
    GROUP_LIST(49, aoow.VECTOR, aopz.MESSAGE),
    MAP(50, aoow.MAP, aopz.VOID);
    
    private static final aoox[] ab;
    public final int Z;
    public final aoow aa;

    static {
        aoox[] values = values();
        ab = new aoox[values.length];
        for (aoox aooxVar : values) {
            ab[aooxVar.Z] = aooxVar;
        }
    }

    aoox(int i, aoow aoowVar, aopz aopzVar) {
        this.Z = i;
        this.aa = aoowVar;
        aopz aopzVar2 = aopz.VOID;
        aoow aoowVar2 = aoow.SCALAR;
        int ordinal = aoowVar.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            Class cls = aopzVar.k;
        }
        if (aoowVar == aoow.SCALAR) {
            aopzVar.ordinal();
        }
    }
}
