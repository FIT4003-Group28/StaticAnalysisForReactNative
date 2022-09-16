package defpackage;
/* compiled from: PG */
/* renamed from: yxf  reason: default package */
/* loaded from: classes4.dex */
public final class yxf {
    public static final int a = zgt.q(8, 1);
    public static final int b = zgt.q(13, 1);
    public final ayoi c;
    private final azpm d;

    public yxf() {
        azpm aI = azpm.aI(Long.valueOf(zgt.x(0, 0)));
        this.d = aI;
        this.c = aI.R();
    }

    public final synchronized void a(int i) {
        int s = zgt.s(((Long) this.d.aJ()).longValue());
        if (zgt.v(s, i) != 0) {
            return;
        }
        int w = zgt.w(s, i, 1);
        if (s == w) {
            return;
        }
        this.d.c(Long.valueOf(zgt.x(w, s)));
    }
}
