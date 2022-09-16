package defpackage;
/* compiled from: PG */
/* renamed from: cykd  reason: default package */
/* loaded from: classes5.dex */
public final class cykd extends dsqw<cykd, cykc> implements dssk {
    public static final cykd b;
    private static volatile dssr<cykd> c;
    public cyjh a;

    static {
        cykd cykdVar = new cykd();
        b = cykdVar;
        dsqw.cc(cykd.class, cykdVar);
    }

    private cykd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cykd();
            }
            if (i2 == 4) {
                return new cykc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cykd.class) {
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
