package defpackage;
/* compiled from: PG */
/* renamed from: dsqj  reason: default package */
/* loaded from: classes6.dex */
public enum dsqj {
    DOUBLE(0, dsqi.a, dsrn.DOUBLE),
    FLOAT(1, dsqi.a, dsrn.FLOAT),
    INT64(2, dsqi.a, dsrn.LONG),
    UINT64(3, dsqi.a, dsrn.LONG),
    INT32(4, dsqi.a, dsrn.INT),
    FIXED64(5, dsqi.a, dsrn.LONG),
    FIXED32(6, dsqi.a, dsrn.INT),
    BOOL(7, dsqi.a, dsrn.BOOLEAN),
    STRING(8, dsqi.a, dsrn.STRING),
    MESSAGE(9, dsqi.a, dsrn.MESSAGE),
    BYTES(10, dsqi.a, dsrn.BYTE_STRING),
    UINT32(11, dsqi.a, dsrn.INT),
    ENUM(12, dsqi.a, dsrn.ENUM),
    SFIXED32(13, dsqi.a, dsrn.INT),
    SFIXED64(14, dsqi.a, dsrn.LONG),
    SINT32(15, dsqi.a, dsrn.INT),
    SINT64(16, dsqi.a, dsrn.LONG),
    GROUP(17, dsqi.a, dsrn.MESSAGE),
    DOUBLE_LIST(18, dsqi.b, dsrn.DOUBLE),
    FLOAT_LIST(19, dsqi.b, dsrn.FLOAT),
    INT64_LIST(20, dsqi.b, dsrn.LONG),
    UINT64_LIST(21, dsqi.b, dsrn.LONG),
    INT32_LIST(22, dsqi.b, dsrn.INT),
    FIXED64_LIST(23, dsqi.b, dsrn.LONG),
    FIXED32_LIST(24, dsqi.b, dsrn.INT),
    BOOL_LIST(25, dsqi.b, dsrn.BOOLEAN),
    STRING_LIST(26, dsqi.b, dsrn.STRING),
    MESSAGE_LIST(27, dsqi.b, dsrn.MESSAGE),
    BYTES_LIST(28, dsqi.b, dsrn.BYTE_STRING),
    UINT32_LIST(29, dsqi.b, dsrn.INT),
    ENUM_LIST(30, dsqi.b, dsrn.ENUM),
    SFIXED32_LIST(31, dsqi.b, dsrn.INT),
    SFIXED64_LIST(32, dsqi.b, dsrn.LONG),
    SINT32_LIST(33, dsqi.b, dsrn.INT),
    SINT64_LIST(34, dsqi.b, dsrn.LONG),
    DOUBLE_LIST_PACKED(35, dsqi.c, dsrn.DOUBLE),
    FLOAT_LIST_PACKED(36, dsqi.c, dsrn.FLOAT),
    INT64_LIST_PACKED(37, dsqi.c, dsrn.LONG),
    UINT64_LIST_PACKED(38, dsqi.c, dsrn.LONG),
    INT32_LIST_PACKED(39, dsqi.c, dsrn.INT),
    FIXED64_LIST_PACKED(40, dsqi.c, dsrn.LONG),
    FIXED32_LIST_PACKED(41, dsqi.c, dsrn.INT),
    BOOL_LIST_PACKED(42, dsqi.c, dsrn.BOOLEAN),
    UINT32_LIST_PACKED(43, dsqi.c, dsrn.INT),
    ENUM_LIST_PACKED(44, dsqi.c, dsrn.ENUM),
    SFIXED32_LIST_PACKED(45, dsqi.c, dsrn.INT),
    SFIXED64_LIST_PACKED(46, dsqi.c, dsrn.LONG),
    SINT32_LIST_PACKED(47, dsqi.c, dsrn.INT),
    SINT64_LIST_PACKED(48, dsqi.c, dsrn.LONG),
    GROUP_LIST(49, dsqi.b, dsrn.MESSAGE),
    MAP(50, dsqi.d, dsrn.VOID);
    
    private static final dsqj[] aa;
    public final int Z;

    static {
        dsqj[] values = values();
        aa = new dsqj[values.length];
        for (dsqj dsqjVar : values) {
            aa[dsqjVar.Z] = dsqjVar;
        }
    }

    dsqj(int i, int i2, dsrn dsrnVar) {
        this.Z = i;
        dsrn dsrnVar2 = dsrn.VOID;
        int i3 = i2 - 1;
        int i4 = dsqi.a;
        if (i2 != 0) {
            if (i3 == 1) {
                Class<?> cls = dsrnVar.k;
            } else if (i3 == 3) {
                Class<?> cls2 = dsrnVar.k;
            }
            if (i2 != dsqi.a) {
                return;
            }
            dsrnVar.ordinal();
            return;
        }
        throw null;
    }
}
