package defpackage;
/* compiled from: PG */
/* renamed from: dkeo  reason: default package */
/* loaded from: classes6.dex */
public final class dkeo extends dsqw<dkeo, dken> implements dssk {
    public static final dkeo b;
    private static volatile dssr<dkeo> c;
    public dsrj<dkei> a = dssu.b;

    static {
        dkeo dkeoVar = new dkeo();
        b = dkeoVar;
        dsqw.cc(dkeo.class, dkeoVar);
    }

    private dkeo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dkei.class});
            }
            if (i2 == 3) {
                return new dkeo();
            }
            if (i2 == 4) {
                return new dken();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkeo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkeo.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
