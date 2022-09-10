package defpackage;
/* compiled from: PG */
/* renamed from: ddin  reason: default package */
/* loaded from: classes5.dex */
public final class ddin extends dsqw<ddin, ddim> implements dssk {
    public static final ddin d;
    private static volatile dssr<ddin> e;
    public int a;
    public int b;
    public int c;

    static {
        ddin ddinVar = new ddin();
        d = ddinVar;
        dsqw.cc(ddin.class, ddinVar);
    }

    private ddin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dqvs.a, "c"});
            }
            if (i2 == 3) {
                return new ddin();
            }
            if (i2 == 4) {
                return new ddim();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddin> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddin.class) {
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
