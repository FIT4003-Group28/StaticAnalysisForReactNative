package defpackage;
/* compiled from: PG */
/* renamed from: dknq  reason: default package */
/* loaded from: classes.dex */
public final class dknq extends dsqw<dknq, dknn> implements dssk {
    public static final dknq b;
    private static volatile dssr<dknq> c;
    public dsrj<dknp> a = dssu.b;

    static {
        dknq dknqVar = new dknq();
        b = dknqVar;
        dsqw.cc(dknq.class, dknqVar);
    }

    private dknq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dknp.class});
            }
            if (i2 == 3) {
                return new dknq();
            }
            if (i2 == 4) {
                return new dknn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dknq.class) {
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
