package defpackage;
/* compiled from: PG */
/* renamed from: ddei  reason: default package */
/* loaded from: classes5.dex */
public final class ddei extends dsqw<ddei, ddeh> implements dssk {
    public static final ddei e;
    private static volatile dssr<ddei> g;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;
    private byte f = 2;

    static {
        ddei ddeiVar = new ddei();
        e = ddeiVar;
        dsqw.cc(ddei.class, ddeiVar);
    }

    private ddei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ျ\u0000\u0005ျ\u0001", new Object[]{"b", "a", "d", "c", ddyb.class, ddxx.class, ddxz.class});
            }
            if (i2 == 3) {
                return new ddei();
            }
            if (i2 == 4) {
                return new ddeh();
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
            dssr<ddei> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddei.class) {
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
