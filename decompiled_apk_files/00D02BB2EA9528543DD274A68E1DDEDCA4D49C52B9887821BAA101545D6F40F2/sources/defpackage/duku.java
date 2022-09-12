package defpackage;
/* compiled from: PG */
/* renamed from: duku  reason: default package */
/* loaded from: classes.dex */
public final class duku extends dsqw<duku, dukt> implements dssk {
    public static final duku a;
    private static volatile dssr<duku> b;

    static {
        duku dukuVar = new duku();
        a = dukuVar;
        dsqw.cc(duku.class, dukuVar);
    }

    private duku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new duku();
            }
            if (i2 == 4) {
                return new dukt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duku> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duku.class) {
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
