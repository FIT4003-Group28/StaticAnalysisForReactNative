package defpackage;
/* compiled from: PG */
/* renamed from: dlyi  reason: default package */
/* loaded from: classes6.dex */
public final class dlyi extends dsqw<dlyi, dlyh> implements dssk {
    public static final dlyi c;
    private static volatile dssr<dlyi> d;
    public int a = 0;
    public Object b;

    static {
        dlyi dlyiVar = new dlyi();
        c = dlyiVar;
        dsqw.cc(dlyi.class, dlyiVar);
    }

    private dlyi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dlyx.class, dlyu.class});
            }
            if (i2 == 3) {
                return new dlyi();
            }
            if (i2 == 4) {
                return new dlyh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlyi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlyi.class) {
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
