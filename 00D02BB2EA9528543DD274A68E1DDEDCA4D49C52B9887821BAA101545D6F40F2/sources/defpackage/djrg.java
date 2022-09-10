package defpackage;
/* compiled from: PG */
/* renamed from: djrg  reason: default package */
/* loaded from: classes6.dex */
public final class djrg extends dsqw<djrg, djrf> implements dssk {
    public static final djrg d;
    private static volatile dssr<djrg> g;
    public int a;
    private dnqh e;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        djrg djrgVar = new djrg();
        d = djrgVar;
        dsqw.cc(djrg.class, djrgVar);
    }

    private djrg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0005ᐉ\u0002", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new djrg();
            }
            if (i2 == 4) {
                return new djrf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djrg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djrg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
