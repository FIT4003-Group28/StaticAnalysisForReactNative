package defpackage;
/* compiled from: PG */
/* renamed from: drwn  reason: default package */
/* loaded from: classes6.dex */
public final class drwn extends dsqw<drwn, drwm> implements dssk {
    public static final drwn d;
    private static volatile dssr<drwn> e;
    public int a;
    public int b;
    public druk c;

    static {
        drwn drwnVar = new drwn();
        d = drwnVar;
        dsqw.cc(drwn.class, drwnVar);
    }

    private drwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", drtk.a, "c"});
            }
            if (i2 == 3) {
                return new drwn();
            }
            if (i2 == 4) {
                return new drwm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drwn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
