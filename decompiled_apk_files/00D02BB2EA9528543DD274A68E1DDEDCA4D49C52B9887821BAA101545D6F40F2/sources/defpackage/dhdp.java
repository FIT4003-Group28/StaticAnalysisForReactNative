package defpackage;
/* compiled from: PG */
/* renamed from: dhdp  reason: default package */
/* loaded from: classes6.dex */
public final class dhdp extends dsqw<dhdp, dhdo> implements dssk {
    public static final dhdp d;
    private static volatile dssr<dhdp> e;
    public Object b;
    public int a = 0;
    public String c = "";

    static {
        dhdp dhdpVar = new dhdp();
        d = dhdpVar;
        dsqw.cc(dhdp.class, dhdpVar);
    }

    private dhdp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0005\u0001\u0000\u0001\u000b\u0005\u0000\u0000\u0000\u0001Ȉ\u0004<\u0000\u0005<\u0000\b<\u0000\u000b<\u0000", new Object[]{"b", "a", "c", dufk.class, dhea.class, duea.class, dueh.class});
            }
            if (i2 == 3) {
                return new dhdp();
            }
            if (i2 == 4) {
                return new dhdo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhdp.class) {
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
