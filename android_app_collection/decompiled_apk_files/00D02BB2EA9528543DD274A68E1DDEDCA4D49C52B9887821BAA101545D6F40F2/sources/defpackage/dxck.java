package defpackage;
/* compiled from: PG */
/* renamed from: dxck  reason: default package */
/* loaded from: classes6.dex */
public final class dxck extends dsqw<dxck, dxcj> implements dssk {
    public static final dxck a;
    private static volatile dssr<dxck> f;
    private int b;
    private dxcg d;
    private byte e = 2;
    private String c = "";

    static {
        dxck dxckVar = new dxck();
        a = dxckVar;
        dsqw.cc(dxck.class, dxckVar);
    }

    private dxck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxck();
            }
            if (i2 == 4) {
                return new dxcj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dxck> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxck.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
