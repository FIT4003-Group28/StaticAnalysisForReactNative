package defpackage;
/* compiled from: PG */
/* renamed from: dusq  reason: default package */
/* loaded from: classes.dex */
public final class dusq extends dsqw<dusq, dusp> implements dssk {
    public static final dusq a;
    private static volatile dssr<dusq> b;

    static {
        dusq dusqVar = new dusq();
        a = dusqVar;
        dsqw.cc(dusq.class, dusqVar);
    }

    private dusq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dusq();
            }
            if (i2 == 4) {
                return new dusp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dusq.class) {
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
