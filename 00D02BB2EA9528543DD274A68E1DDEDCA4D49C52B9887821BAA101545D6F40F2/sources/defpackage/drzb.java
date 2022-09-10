package defpackage;
/* compiled from: PG */
/* renamed from: drzb  reason: default package */
/* loaded from: classes6.dex */
public final class drzb extends dsqw<drzb, drza> implements dssk {
    public static final drzb b;
    private static volatile dssr<drzb> c;
    public dsrj<dscr> a = dssu.b;

    static {
        drzb drzbVar = new drzb();
        b = drzbVar;
        dsqw.cc(drzb.class, drzbVar);
    }

    private drzb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dscr.class});
            }
            if (i2 == 3) {
                return new drzb();
            }
            if (i2 == 4) {
                return new drza();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drzb.class) {
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
