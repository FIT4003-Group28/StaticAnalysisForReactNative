package defpackage;
/* compiled from: PG */
/* renamed from: djdl  reason: default package */
/* loaded from: classes6.dex */
public final class djdl extends dsqw<djdl, djdk> implements dssk {
    public static final djdl g;
    private static volatile dssr<djdl> h;
    public int a;
    public dkgh b;
    public int c;
    public String d = "";
    public dsrj<dqeg> e = dssu.b;
    public boolean f;

    static {
        djdl djdlVar = new djdl();
        g = djdlVar;
        dsqw.cc(djdl.class, djdlVar);
    }

    private djdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0003င\u0001\u0004ဈ\u0002\u0006\u001b\u0007ဇ\u0003", new Object[]{"a", "b", "c", "d", "e", dqeg.class, "f"});
            }
            if (i2 == 3) {
                return new djdl();
            }
            if (i2 == 4) {
                return new djdk();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djdl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
