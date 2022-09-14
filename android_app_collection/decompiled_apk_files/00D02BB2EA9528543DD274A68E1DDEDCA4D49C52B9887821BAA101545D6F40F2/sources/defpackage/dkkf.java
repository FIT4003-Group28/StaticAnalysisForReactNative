package defpackage;
/* compiled from: PG */
/* renamed from: dkkf  reason: default package */
/* loaded from: classes6.dex */
public final class dkkf extends dsqw<dkkf, dkkc> implements dssk {
    public static final dkkf b;
    private static volatile dssr<dkkf> c;
    public dsrj<dkke> a = dssu.b;

    static {
        dkkf dkkfVar = new dkkf();
        b = dkkfVar;
        dsqw.cc(dkkf.class, dkkfVar);
    }

    private dkkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dkke.class});
            }
            if (i2 == 3) {
                return new dkkf();
            }
            if (i2 == 4) {
                return new dkkc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkkf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkkf.class) {
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
