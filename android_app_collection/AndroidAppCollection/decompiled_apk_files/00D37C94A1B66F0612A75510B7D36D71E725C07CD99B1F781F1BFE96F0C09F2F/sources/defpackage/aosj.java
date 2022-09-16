package defpackage;
/* compiled from: PG */
/* renamed from: aosj  reason: default package */
/* loaded from: classes.dex */
public enum aosj {
    DOUBLE(aosk.DOUBLE, 1),
    FLOAT(aosk.FLOAT, 5),
    INT64(aosk.LONG, 0),
    UINT64(aosk.LONG, 0),
    INT32(aosk.INT, 0),
    FIXED64(aosk.LONG, 1),
    FIXED32(aosk.INT, 5),
    BOOL(aosk.BOOLEAN, 0),
    STRING(aosk.STRING, 2),
    GROUP(aosk.MESSAGE, 3),
    MESSAGE(aosk.MESSAGE, 2),
    BYTES(aosk.BYTE_STRING, 2),
    UINT32(aosk.INT, 0),
    ENUM(aosk.ENUM, 0),
    SFIXED32(aosk.INT, 5),
    SFIXED64(aosk.LONG, 1),
    SINT32(aosk.INT, 0),
    SINT64(aosk.LONG, 0);
    
    public final aosk s;
    public final int t;

    aosj(aosk aoskVar, int i) {
        this.s = aoskVar;
        this.t = i;
    }
}
