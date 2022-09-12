package defpackage;
/* compiled from: PG */
/* renamed from: druk  reason: default package */
/* loaded from: classes6.dex */
public final class druk extends dsqw<druk, druj> implements dssk {
    public static final druk c;
    private static volatile dssr<druk> d;
    public int a = 0;
    public Object b;

    static {
        druk drukVar = new druk();
        c = drukVar;
        dsqw.cc(druk.class, drukVar);
    }

    private druk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", druo.class, druu.class, druw.class, drtp.class, drwi.class, drui.class, drxa.class, drve.class, druy.class});
            }
            if (i2 == 3) {
                return new druk();
            }
            if (i2 == 4) {
                return new druj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<druk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (druk.class) {
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
