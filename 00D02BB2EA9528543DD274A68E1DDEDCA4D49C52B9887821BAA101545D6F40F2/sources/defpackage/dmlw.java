package defpackage;
/* compiled from: PG */
/* renamed from: dmlw  reason: default package */
/* loaded from: classes6.dex */
public final class dmlw extends dsqw<dmlw, dmlv> implements dssk {
    public static final dmlw b;
    private static volatile dssr<dmlw> c;
    public dsre a = dsqk.b;

    static {
        dmlw dmlwVar = new dmlw();
        b = dmlwVar;
        dsqw.cc(dmlw.class, dmlwVar);
    }

    private dmlw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dmlw();
            }
            if (i2 == 4) {
                return new dmlv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmlw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmlw.class) {
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
