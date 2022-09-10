package defpackage;
/* compiled from: PG */
/* renamed from: dohc  reason: default package */
/* loaded from: classes6.dex */
public final class dohc extends dsqw<dohc, dohb> implements dssk {
    public static final dohc c;
    private static volatile dssr<dohc> d;
    public int a;
    public boolean b;

    static {
        dohc dohcVar = new dohc();
        c = dohcVar;
        dsqw.cc(dohc.class, dohcVar);
    }

    private dohc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dohc();
            }
            if (i2 == 4) {
                return new dohb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dohc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
