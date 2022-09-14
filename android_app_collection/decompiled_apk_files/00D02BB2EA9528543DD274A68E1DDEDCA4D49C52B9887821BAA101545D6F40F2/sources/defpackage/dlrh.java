package defpackage;
/* compiled from: PG */
/* renamed from: dlrh  reason: default package */
/* loaded from: classes6.dex */
public final class dlrh extends dsqw<dlrh, dlrc> implements dssk {
    public static final dlrh c;
    private static volatile dssr<dlrh> d;
    public int a = 0;
    public Object b;

    static {
        dlrh dlrhVar = new dlrh();
        c = dlrhVar;
        dsqw.cc(dlrh.class, dlrhVar);
    }

    private dlrh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dlrg.class, dlre.class});
            }
            if (i2 == 3) {
                return new dlrh();
            }
            if (i2 == 4) {
                return new dlrc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlrh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlrh.class) {
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
