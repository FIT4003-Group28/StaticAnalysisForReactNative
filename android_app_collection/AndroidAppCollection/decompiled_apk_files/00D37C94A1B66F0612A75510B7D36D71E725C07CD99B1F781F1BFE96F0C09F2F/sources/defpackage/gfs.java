package defpackage;
/* compiled from: PG */
/* renamed from: gfs  reason: default package */
/* loaded from: classes3.dex */
public enum gfs {
    LIGHT(1, 2),
    DARK(2, 3);
    
    public final int c;
    public final int d;

    gfs(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public static ampq a(int i) {
        gfs[] values;
        for (gfs gfsVar : values()) {
            if (gfsVar.c == i) {
                return ampq.j(gfsVar);
            }
        }
        return amon.a;
    }

    public final String b() {
        int i = this.d;
        String a = aphq.a(i);
        if (i != 0) {
            return a;
        }
        throw null;
    }
}
