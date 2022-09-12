package defpackage;
/* compiled from: PG */
/* renamed from: dglc  reason: default package */
/* loaded from: classes6.dex */
public final class dglc extends dsqw<dglc, dglb> implements dssk {
    public static final dglc b;
    private static volatile dssr<dglc> c;
    public dsrj<dgla> a = dssu.b;

    static {
        dglc dglcVar = new dglc();
        b = dglcVar;
        dsqw.cc(dglc.class, dglcVar);
    }

    private dglc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgla.class});
            }
            if (i2 == 3) {
                return new dglc();
            }
            if (i2 == 4) {
                return new dglb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dglc.class) {
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
