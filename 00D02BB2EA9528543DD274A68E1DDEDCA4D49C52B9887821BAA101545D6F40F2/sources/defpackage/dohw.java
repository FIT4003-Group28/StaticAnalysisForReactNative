package defpackage;
/* compiled from: PG */
/* renamed from: dohw  reason: default package */
/* loaded from: classes6.dex */
public final class dohw extends dsqw<dohw, dohv> implements dssk {
    public static final dohw b;
    private static volatile dssr<dohw> c;
    public dsrj<dokf> a = dssu.b;

    static {
        dohw dohwVar = new dohw();
        b = dohwVar;
        dsqw.cc(dohw.class, dohwVar);
    }

    private dohw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dokf.class});
            }
            if (i2 == 3) {
                return new dohw();
            }
            if (i2 == 4) {
                return new dohv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dohw.class) {
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
