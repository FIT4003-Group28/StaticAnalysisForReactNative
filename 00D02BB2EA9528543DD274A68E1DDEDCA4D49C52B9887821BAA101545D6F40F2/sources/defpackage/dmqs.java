package defpackage;
/* compiled from: PG */
/* renamed from: dmqs  reason: default package */
/* loaded from: classes.dex */
public final class dmqs extends dsqw<dmqs, dmqr> implements dssk {
    public static final dmqs a;
    private static volatile dssr<dmqs> b;

    static {
        dmqs dmqsVar = new dmqs();
        a = dmqsVar;
        dsqw.cc(dmqs.class, dmqsVar);
    }

    private dmqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmqs();
            }
            if (i2 == 4) {
                return new dmqr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmqs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmqs.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
