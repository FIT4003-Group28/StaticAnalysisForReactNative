package defpackage;
/* compiled from: PG */
/* renamed from: aqxk  reason: default package */
/* loaded from: classes2.dex */
public final class aqxk extends dsqw<aqxk, aqxg> implements dssk {
    public static final aqxk e;
    private static volatile dssr<aqxk> f;
    public int a;
    public int b;
    public aqxp c;
    public int d;

    static {
        aqxk aqxkVar = new aqxk();
        e = aqxkVar;
        dsqw.cc(aqxk.class, aqxkVar);
    }

    private aqxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\t\u0004\f", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new aqxk();
            }
            if (i2 == 4) {
                return new aqxg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aqxk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (aqxk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
