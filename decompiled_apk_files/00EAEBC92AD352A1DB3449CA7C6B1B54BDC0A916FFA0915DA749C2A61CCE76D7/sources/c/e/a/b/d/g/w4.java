package c.e.a.b.d.g;
/* loaded from: classes.dex */
public enum w4 {
    DOUBLE(0, y4.SCALAR, l5.DOUBLE),
    FLOAT(1, y4.SCALAR, l5.FLOAT),
    INT64(2, y4.SCALAR, l5.LONG),
    UINT64(3, y4.SCALAR, l5.LONG),
    INT32(4, y4.SCALAR, l5.INT),
    FIXED64(5, y4.SCALAR, l5.LONG),
    FIXED32(6, y4.SCALAR, l5.INT),
    BOOL(7, y4.SCALAR, l5.BOOLEAN),
    STRING(8, y4.SCALAR, l5.STRING),
    MESSAGE(9, y4.SCALAR, l5.MESSAGE),
    BYTES(10, y4.SCALAR, l5.BYTE_STRING),
    UINT32(11, y4.SCALAR, l5.INT),
    ENUM(12, y4.SCALAR, l5.ENUM),
    SFIXED32(13, y4.SCALAR, l5.INT),
    SFIXED64(14, y4.SCALAR, l5.LONG),
    SINT32(15, y4.SCALAR, l5.INT),
    SINT64(16, y4.SCALAR, l5.LONG),
    GROUP(17, y4.SCALAR, l5.MESSAGE),
    DOUBLE_LIST(18, y4.VECTOR, l5.DOUBLE),
    FLOAT_LIST(19, y4.VECTOR, l5.FLOAT),
    INT64_LIST(20, y4.VECTOR, l5.LONG),
    UINT64_LIST(21, y4.VECTOR, l5.LONG),
    INT32_LIST(22, y4.VECTOR, l5.INT),
    FIXED64_LIST(23, y4.VECTOR, l5.LONG),
    FIXED32_LIST(24, y4.VECTOR, l5.INT),
    BOOL_LIST(25, y4.VECTOR, l5.BOOLEAN),
    STRING_LIST(26, y4.VECTOR, l5.STRING),
    MESSAGE_LIST(27, y4.VECTOR, l5.MESSAGE),
    BYTES_LIST(28, y4.VECTOR, l5.BYTE_STRING),
    UINT32_LIST(29, y4.VECTOR, l5.INT),
    ENUM_LIST(30, y4.VECTOR, l5.ENUM),
    SFIXED32_LIST(31, y4.VECTOR, l5.INT),
    SFIXED64_LIST(32, y4.VECTOR, l5.LONG),
    SINT32_LIST(33, y4.VECTOR, l5.INT),
    SINT64_LIST(34, y4.VECTOR, l5.LONG),
    DOUBLE_LIST_PACKED(35, y4.PACKED_VECTOR, l5.DOUBLE),
    FLOAT_LIST_PACKED(36, y4.PACKED_VECTOR, l5.FLOAT),
    INT64_LIST_PACKED(37, y4.PACKED_VECTOR, l5.LONG),
    UINT64_LIST_PACKED(38, y4.PACKED_VECTOR, l5.LONG),
    INT32_LIST_PACKED(39, y4.PACKED_VECTOR, l5.INT),
    FIXED64_LIST_PACKED(40, y4.PACKED_VECTOR, l5.LONG),
    FIXED32_LIST_PACKED(41, y4.PACKED_VECTOR, l5.INT),
    BOOL_LIST_PACKED(42, y4.PACKED_VECTOR, l5.BOOLEAN),
    UINT32_LIST_PACKED(43, y4.PACKED_VECTOR, l5.INT),
    ENUM_LIST_PACKED(44, y4.PACKED_VECTOR, l5.ENUM),
    SFIXED32_LIST_PACKED(45, y4.PACKED_VECTOR, l5.INT),
    SFIXED64_LIST_PACKED(46, y4.PACKED_VECTOR, l5.LONG),
    SINT32_LIST_PACKED(47, y4.PACKED_VECTOR, l5.INT),
    SINT64_LIST_PACKED(48, y4.PACKED_VECTOR, l5.LONG),
    GROUP_LIST(49, y4.VECTOR, l5.MESSAGE),
    MAP(50, y4.MAP, l5.VOID);
    
    private static final w4[] b0;

    /* renamed from: b  reason: collision with root package name */
    private final int f4502b;

    static {
        w4[] values = values();
        b0 = new w4[values.length];
        for (w4 w4Var : values) {
            b0[w4Var.f4502b] = w4Var;
        }
    }

    w4(int i, y4 y4Var, l5 l5Var) {
        int i2;
        this.f4502b = i;
        int i3 = v4.f4477a[y4Var.ordinal()];
        if (i3 == 1 || i3 == 2) {
            l5Var.a();
        }
        if (y4Var == y4.SCALAR && (i2 = v4.f4478b[l5Var.ordinal()]) != 1 && i2 == 2) {
        }
    }

    public final int a() {
        return this.f4502b;
    }
}
