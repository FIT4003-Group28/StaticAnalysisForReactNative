package defpackage;
/* compiled from: PG */
/* renamed from: dugm  reason: default package */
/* loaded from: classes6.dex */
public final class dugm extends dsqw<dugm, dugl> implements dssk {
    public static final dugm d;
    private static volatile dssr<dugm> f;
    public String a = "";
    public dugk b;
    public dugo c;
    private int e;

    static {
        dugm dugmVar = new dugm();
        d = dugmVar;
        dsqw.cc(dugm.class, dugmVar);
    }

    private dugm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dugm();
            }
            if (i2 == 4) {
                return new dugl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dugm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
