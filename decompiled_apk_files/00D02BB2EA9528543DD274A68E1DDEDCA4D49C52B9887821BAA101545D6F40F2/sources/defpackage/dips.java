package defpackage;
/* compiled from: PG */
/* renamed from: dips  reason: default package */
/* loaded from: classes6.dex */
public final class dips extends dsqw<dips, dipr> implements dssk {
    public static final dips c;
    private static volatile dssr<dips> d;
    public int a;
    public long b;

    static {
        dips dipsVar = new dips();
        c = dipsVar;
        dsqw.cc(dips.class, dipsVar);
    }

    private dips() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dips();
            }
            if (i2 == 4) {
                return new dipr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dips> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dips.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
