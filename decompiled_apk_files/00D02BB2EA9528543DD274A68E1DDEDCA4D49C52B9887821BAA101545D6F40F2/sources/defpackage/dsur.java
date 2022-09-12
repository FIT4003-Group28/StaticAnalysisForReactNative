package defpackage;
/* compiled from: PG */
/* renamed from: dsur  reason: default package */
/* loaded from: classes.dex */
public enum dsur {
    DOUBLE(dsus.DOUBLE, 1),
    FLOAT(dsus.FLOAT, 5),
    INT64(dsus.LONG, 0),
    UINT64(dsus.LONG, 0),
    INT32(dsus.INT, 0),
    FIXED64(dsus.LONG, 1),
    FIXED32(dsus.INT, 5),
    BOOL(dsus.BOOLEAN, 0),
    STRING(dsus.STRING, 2),
    GROUP(dsus.MESSAGE, 3),
    MESSAGE(dsus.MESSAGE, 2),
    BYTES(dsus.BYTE_STRING, 2),
    UINT32(dsus.INT, 0),
    ENUM(dsus.ENUM, 0),
    SFIXED32(dsus.INT, 5),
    SFIXED64(dsus.LONG, 1),
    SINT32(dsus.INT, 0),
    SINT64(dsus.LONG, 0);
    
    public final dsus s;
    public final int t;

    dsur(dsus dsusVar, int i) {
        this.s = dsusVar;
        this.t = i;
    }
}
