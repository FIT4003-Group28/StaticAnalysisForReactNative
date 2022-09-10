package defpackage;
/* compiled from: PG */
/* renamed from: dvng  reason: default package */
/* loaded from: classes6.dex */
public final class dvng extends dsqw<dvng, dvnf> implements dssk {
    public static final dvng a;
    private static volatile dssr<dvng> e;
    private int b;
    private dvtm c;
    private byte d = 2;

    static {
        dvng dvngVar = new dvng();
        a = dvngVar;
        dsqw.cc(dvng.class, dvngVar);
    }

    private dvng() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dvng();
            }
            if (i2 == 4) {
                return new dvnf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dvng> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvng.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
