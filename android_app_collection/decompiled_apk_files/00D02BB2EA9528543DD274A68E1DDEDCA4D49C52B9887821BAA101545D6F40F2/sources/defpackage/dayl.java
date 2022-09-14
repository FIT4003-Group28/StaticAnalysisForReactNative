package defpackage;
/* compiled from: PG */
/* renamed from: dayl  reason: default package */
/* loaded from: classes5.dex */
public final class dayl extends dsqw<dayl, dayk> implements dssk {
    public static final dsrg<Integer, dayg> c = new dayj();
    public static final dayl d;
    private static volatile dssr<dayl> f;
    public String a = "";
    public dsrf b = dsqz.b;
    private int e;

    static {
        dayl daylVar = new dayl();
        d = daylVar;
        dsqw.cc(dayl.class, daylVar);
    }

    private dayl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"e", "a", "b", dayg.c()});
            }
            if (i2 == 3) {
                return new dayl();
            }
            if (i2 == 4) {
                return new dayk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dayl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dayl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
