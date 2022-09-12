package defpackage;
/* compiled from: PG */
/* renamed from: dpaf  reason: default package */
/* loaded from: classes6.dex */
public final class dpaf extends dsqw<dpaf, dpae> implements dssk {
    public static final dpaf f;
    private static volatile dssr<dpaf> h;
    public int a;
    public dpan b;
    public dgas c;
    public dquj d;
    public int e;
    private byte g = 2;

    static {
        dpaf dpafVar = new dpaf();
        f = dpafVar;
        dsqw.cc(dpaf.class, dpafVar);
    }

    private dpaf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0002\u0004ဉ\u0001\u0005ဌ\u0004", new Object[]{"a", "b", "d", "c", "e", dpej.c()});
            }
            if (i2 == 3) {
                return new dpaf();
            }
            if (i2 == 4) {
                return new dpae();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dpaf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpaf.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
