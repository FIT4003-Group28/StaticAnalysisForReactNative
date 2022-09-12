package defpackage;
/* compiled from: PG */
/* renamed from: djex  reason: default package */
/* loaded from: classes6.dex */
public final class djex extends dsqw<djex, djew> implements dssk {
    public static final djex d;
    private static volatile dssr<djex> g;
    public dkgh a;
    private int e;
    private byte f = 2;
    public String b = "";
    public dsrj<djev> c = dssu.b;

    static {
        djex djexVar = new djex();
        d = djexVar;
        dsqw.cc(djex.class, djexVar);
    }

    private djex() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0003ဈ\u0002\u0004Л", new Object[]{"e", "a", "b", "c", djev.class});
            }
            if (i2 == 3) {
                return new djex();
            }
            if (i2 == 4) {
                return new djew();
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
            dssr<djex> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djex.class) {
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
