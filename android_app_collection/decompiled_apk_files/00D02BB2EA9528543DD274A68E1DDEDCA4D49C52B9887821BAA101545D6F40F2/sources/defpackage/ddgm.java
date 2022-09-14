package defpackage;
/* compiled from: PG */
/* renamed from: ddgm  reason: default package */
/* loaded from: classes5.dex */
public final class ddgm extends dsqw<ddgm, ddgk> implements dssk {
    public static final ddgm d;
    private static volatile dssr<ddgm> e;
    public int a;
    public int b;
    public int c;

    static {
        ddgm ddgmVar = new ddgm();
        d = ddgmVar;
        dsqw.cc(ddgm.class, ddgmVar);
    }

    private ddgm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", ddgl.a, "c", drtc.c()});
            }
            if (i2 == 3) {
                return new ddgm();
            }
            if (i2 == 4) {
                return new ddgk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddgm.class) {
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
