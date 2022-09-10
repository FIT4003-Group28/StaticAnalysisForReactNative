package defpackage;
/* compiled from: PG */
/* renamed from: djfg  reason: default package */
/* loaded from: classes6.dex */
public final class djfg extends dsqw<djfg, djff> implements dssk {
    public static final djfg e;
    private static volatile dssr<djfg> g;
    public String a = "";
    public String b = "";
    public dsrj<djfe> c = dssu.b;
    public String d = "";
    private int f;

    static {
        djfg djfgVar = new djfg();
        e = djfgVar;
        dsqw.cc(djfg.class, djfgVar);
    }

    private djfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001b\u0004ဈ\u0002\u0005ဈ\u0001", new Object[]{"f", "a", "c", djfe.class, "d", "b"});
            }
            if (i2 == 3) {
                return new djfg();
            }
            if (i2 == 4) {
                return new djff();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djfg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djfg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
