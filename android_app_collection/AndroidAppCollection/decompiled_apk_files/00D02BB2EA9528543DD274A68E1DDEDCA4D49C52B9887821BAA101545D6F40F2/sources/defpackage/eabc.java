package defpackage;
/* compiled from: PG */
/* renamed from: eabc  reason: default package */
/* loaded from: classes6.dex */
public final class eabc extends dsqw<eabc, eabb> implements dssk {
    public static final eabc a;
    private static volatile dssr<eabc> e;
    private int b;
    private ddyw c;
    private byte d = 2;

    static {
        eabc eabcVar = new eabc();
        a = eabcVar;
        dsqw.cc(eabc.class, eabcVar);
    }

    private eabc() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new eabc();
            }
            if (i2 == 4) {
                return new eabb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<eabc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eabc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
