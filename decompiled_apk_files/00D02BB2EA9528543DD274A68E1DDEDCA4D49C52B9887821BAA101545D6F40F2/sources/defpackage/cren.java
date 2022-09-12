package defpackage;
/* compiled from: PG */
/* renamed from: cren  reason: default package */
/* loaded from: classes5.dex */
public enum cren {
    UNMUTED(0, 2),
    MINIMAL(1, 1),
    MUTED(2, 0);
    
    public final int d;
    public final int e;

    cren(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @dzsi
    public static cren a(int i) {
        cren[] values;
        for (cren crenVar : values()) {
            if (crenVar.d == i) {
                return crenVar;
            }
        }
        return null;
    }
}
