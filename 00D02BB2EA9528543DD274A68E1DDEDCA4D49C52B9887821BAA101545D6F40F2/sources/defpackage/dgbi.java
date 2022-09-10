package defpackage;
/* compiled from: PG */
/* renamed from: dgbi  reason: default package */
/* loaded from: classes.dex */
public final class dgbi extends dsqw<dgbi, dgbh> implements dssk {
    public static final dgbi b;
    private static volatile dssr<dgbi> c;
    public dsrj<dgbg> a = dssu.b;

    static {
        dgbi dgbiVar = new dgbi();
        b = dgbiVar;
        dsqw.cc(dgbi.class, dgbiVar);
    }

    private dgbi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgbg.class});
            }
            if (i2 == 3) {
                return new dgbi();
            }
            if (i2 == 4) {
                return new dgbh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgbi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgbi.class) {
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
