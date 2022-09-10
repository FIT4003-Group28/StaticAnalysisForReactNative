package defpackage;
/* compiled from: PG */
/* renamed from: dkuq  reason: default package */
/* loaded from: classes.dex */
public final class dkuq extends dsqw<dkuq, dkup> implements dssk {
    public static final dkuq b;
    private static volatile dssr<dkuq> c;
    public dsrj<dksu> a = dssu.b;

    static {
        dkuq dkuqVar = new dkuq();
        b = dkuqVar;
        dsqw.cc(dkuq.class, dkuqVar);
    }

    private dkuq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dksu.class});
            }
            if (i2 == 3) {
                return new dkuq();
            }
            if (i2 == 4) {
                return new dkup();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkuq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkuq.class) {
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
