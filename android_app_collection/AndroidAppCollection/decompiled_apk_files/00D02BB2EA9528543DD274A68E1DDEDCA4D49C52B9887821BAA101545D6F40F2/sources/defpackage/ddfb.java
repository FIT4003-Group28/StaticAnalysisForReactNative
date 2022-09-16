package defpackage;
/* compiled from: PG */
/* renamed from: ddfb  reason: default package */
/* loaded from: classes.dex */
public final class ddfb extends dsqw<ddfb, ddey> implements dssk {
    public static final ddfb g;
    private static volatile dssr<ddfb> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        ddfb ddfbVar = new ddfb();
        g = ddfbVar;
        dsqw.cc(ddfb.class, ddfbVar);
    }

    private ddfb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0005င\u0004\tင\b", new Object[]{"a", "b", ddfa.a, "c", ddez.a, "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ddfb();
            }
            if (i2 == 4) {
                return new ddey();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddfb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
