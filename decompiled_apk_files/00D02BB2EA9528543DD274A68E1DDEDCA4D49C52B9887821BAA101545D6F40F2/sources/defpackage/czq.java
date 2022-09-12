package defpackage;
/* compiled from: PG */
/* renamed from: czq  reason: default package */
/* loaded from: classes5.dex */
public enum czq {
    DIRECTIONS_OVERLAY(1),
    ACCESS_CAMERA(2),
    AWARENESS(3);
    
    public static final ain<czq> e;
    public final int d;

    static {
        czq[] values = values();
        e = new ain<>(values.length);
        for (czq czqVar : values) {
            e.e(czqVar.d, czqVar);
        }
    }

    czq(int i) {
        this.d = i;
    }
}
