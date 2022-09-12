package defpackage;
/* compiled from: PG */
/* renamed from: dseo  reason: default package */
/* loaded from: classes6.dex */
public final class dseo extends dsqw<dseo, dsel> implements dssk {
    public static final dseo b;
    private static volatile dssr<dseo> c;
    public dsrj<dsen> a = dssu.b;

    static {
        dseo dseoVar = new dseo();
        b = dseoVar;
        dsqw.cc(dseo.class, dseoVar);
    }

    private dseo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsen.class});
            }
            if (i2 == 3) {
                return new dseo();
            }
            if (i2 == 4) {
                return new dsel();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dseo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dseo.class) {
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
