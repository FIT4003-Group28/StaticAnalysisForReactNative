package defpackage;
/* compiled from: PG */
/* renamed from: drnd  reason: default package */
/* loaded from: classes6.dex */
public final class drnd extends dsqw<drnd, drnc> implements dssk {
    public static final drnd c;
    private static volatile dssr<drnd> d;
    public int a;
    public int b;

    static {
        drnd drndVar = new drnd();
        c = drndVar;
        dsqw.cc(drnd.class, drndVar);
    }

    private drnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drne.a});
            }
            if (i2 == 3) {
                return new drnd();
            }
            if (i2 == 4) {
                return new drnc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drnd.class) {
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
