package defpackage;
/* compiled from: PG */
/* renamed from: ddrm  reason: default package */
/* loaded from: classes6.dex */
public final class ddrm extends dsqw<ddrm, ddrl> implements dssk {
    public static final ddrm d;
    private static volatile dssr<ddrm> e;
    public int a;
    public int b;
    public int c;

    static {
        ddrm ddrmVar = new ddrm();
        d = ddrmVar;
        dsqw.cc(ddrm.class, ddrmVar);
    }

    private ddrm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddrm();
            }
            if (i2 == 4) {
                return new ddrl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddrm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddrm.class) {
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
