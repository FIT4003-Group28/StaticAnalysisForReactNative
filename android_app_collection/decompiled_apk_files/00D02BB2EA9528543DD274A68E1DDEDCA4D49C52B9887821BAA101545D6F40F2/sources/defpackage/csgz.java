package defpackage;
/* compiled from: PG */
/* renamed from: csgz  reason: default package */
/* loaded from: classes5.dex */
public final class csgz extends dsqs<csgz, csgy> implements dsqt {
    public static final csgz d;
    private static volatile dssr<csgz> f;
    public int a;
    public int b;
    private byte e = 2;
    public dsrf c = dsqz.b;

    static {
        csgz csgzVar = new csgz();
        d = csgzVar;
        dsqw.cc(csgz.class, csgzVar);
    }

    private csgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"a", "b", deaf.c(), "c"});
            }
            if (i2 == 3) {
                return new csgz();
            }
            if (i2 == 4) {
                return new csgy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<csgz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (csgz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
