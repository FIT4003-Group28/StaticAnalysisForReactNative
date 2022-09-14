package defpackage;
/* compiled from: PG */
/* renamed from: crtk  reason: default package */
/* loaded from: classes5.dex */
public final class crtk extends dsqw<crtk, crtj> implements dssk {
    public static final crtk c;
    private static volatile dssr<crtk> d;
    public int a;
    public dspd b = dspd.b;

    static {
        crtk crtkVar = new crtk();
        c = crtkVar;
        dsqw.cc(crtk.class, crtkVar);
    }

    private crtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new crtk();
            }
            if (i2 == 4) {
                return new crtj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crtk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (crtk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
