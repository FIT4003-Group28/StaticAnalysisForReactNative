package defpackage;
/* compiled from: PG */
/* renamed from: dbok  reason: default package */
/* loaded from: classes5.dex */
public final class dbok extends dsqw<dbok, dboj> implements dssk {
    public static final dbok b;
    private static volatile dssr<dbok> c;
    public int a;

    static {
        dbok dbokVar = new dbok();
        b = dbokVar;
        dsqw.cc(dbok.class, dbokVar);
    }

    private dbok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dbok();
            }
            if (i2 == 4) {
                return new dboj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbok> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dbok.class) {
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
