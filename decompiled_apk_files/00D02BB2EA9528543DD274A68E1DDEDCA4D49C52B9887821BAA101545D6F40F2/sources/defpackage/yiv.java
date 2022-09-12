package defpackage;
/* compiled from: PG */
/* renamed from: yiv  reason: default package */
/* loaded from: classes7.dex */
public final class yiv extends dsqw<yiv, yim> implements dssk {
    public static final yiv e;
    private static volatile dssr<yiv> f;
    public int a;
    public yis b;
    public yiu c;
    public yio d;

    static {
        yiv yivVar = new yiv();
        e = yivVar;
        dsqw.cc(yiv.class, yivVar);
    }

    private yiv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new yiv();
            }
            if (i2 == 4) {
                return new yim();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<yiv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (yiv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
