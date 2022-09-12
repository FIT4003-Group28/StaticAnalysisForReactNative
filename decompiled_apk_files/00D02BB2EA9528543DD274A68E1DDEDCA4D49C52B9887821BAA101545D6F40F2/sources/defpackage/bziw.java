package defpackage;
/* compiled from: PG */
/* renamed from: bziw  reason: default package */
/* loaded from: classes4.dex */
public final class bziw extends dsqw<bziw, bziv> implements dssk {
    public static final bziw d;
    private static volatile dssr<bziw> e;
    public int a;
    public bzis b;
    public long c;

    static {
        bziw bziwVar = new bziw();
        d = bziwVar;
        dsqw.cc(bziw.class, bziwVar);
    }

    private bziw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bziw();
            }
            if (i2 == 4) {
                return new bziv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bziw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bziw.class) {
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
