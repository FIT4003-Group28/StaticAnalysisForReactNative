package defpackage;
/* compiled from: PG */
/* renamed from: dtvf  reason: default package */
/* loaded from: classes6.dex */
public final class dtvf extends dsqw<dtvf, dtve> implements dssk {
    public static final dtvf b;
    private static volatile dssr<dtvf> c;
    public dsrj<String> a = dssu.b;

    static {
        dtvf dtvfVar = new dtvf();
        b = dtvfVar;
        dsqw.cc(dtvf.class, dtvfVar);
    }

    private dtvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtvf();
            }
            if (i2 == 4) {
                return new dtve();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtvf.class) {
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
