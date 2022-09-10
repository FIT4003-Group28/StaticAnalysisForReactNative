package defpackage;
/* compiled from: PG */
/* renamed from: dkzj  reason: default package */
/* loaded from: classes6.dex */
public final class dkzj extends dsqw<dkzj, dkzi> implements dssk {
    public static final dkzj c;
    private static volatile dssr<dkzj> d;
    public int a;
    public String b = "";

    static {
        dkzj dkzjVar = new dkzj();
        c = dkzjVar;
        dsqw.cc(dkzj.class, dkzjVar);
    }

    private dkzj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkzj();
            }
            if (i2 == 4) {
                return new dkzi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkzj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkzj.class) {
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
