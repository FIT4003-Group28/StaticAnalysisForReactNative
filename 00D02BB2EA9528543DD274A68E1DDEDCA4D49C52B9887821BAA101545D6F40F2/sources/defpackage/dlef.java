package defpackage;
/* compiled from: PG */
/* renamed from: dlef  reason: default package */
/* loaded from: classes6.dex */
public final class dlef extends dsqw<dlef, dlec> implements dssk {
    public static final dlef c;
    private static volatile dssr<dlef> e;
    public dlee a;
    public boolean b;
    private int d;

    static {
        dlef dlefVar = new dlef();
        c = dlefVar;
        dsqw.cc(dlef.class, dlefVar);
    }

    private dlef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlef();
            }
            if (i2 == 4) {
                return new dlec();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlef> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlef.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
