package defpackage;
/* compiled from: PG */
/* renamed from: drcm  reason: default package */
/* loaded from: classes6.dex */
public final class drcm extends dsqw<drcm, drcl> implements dssk {
    public static final drcm d;
    private static volatile dssr<drcm> e;
    public int a;
    public dfzq b;
    public dsrj<dfzq> c = dssu.b;

    static {
        drcm drcmVar = new drcm();
        d = drcmVar;
        dsqw.cc(drcm.class, drcmVar);
    }

    private drcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dfzq.class});
            }
            if (i2 == 3) {
                return new drcm();
            }
            if (i2 == 4) {
                return new drcl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drcm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drcm.class) {
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
