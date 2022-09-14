package defpackage;
/* compiled from: PG */
/* renamed from: dvit  reason: default package */
/* loaded from: classes.dex */
public final class dvit extends dsqw<dvit, dvis> implements dssk {
    public static final dvit e;
    private static volatile dssr<dvit> g;
    public int a;
    public dqpe b;
    public dvyw c;
    public int d;
    private byte f = 2;

    static {
        dvit dvitVar = new dvit();
        e = dvitVar;
        dsqw.cc(dvit.class, dvitVar);
    }

    private dvit() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0001\u0002ᐉ\u0002\u0003ဌ\u0003", new Object[]{"a", "b", "c", "d", drbs.a});
            }
            if (i2 == 3) {
                return new dvit();
            }
            if (i2 == 4) {
                return new dvis();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvit> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvit.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
