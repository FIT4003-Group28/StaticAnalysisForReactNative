package defpackage;
/* compiled from: PG */
/* renamed from: dmfu  reason: default package */
/* loaded from: classes6.dex */
public final class dmfu extends dsqs<dmfu, dmft> implements dsqt {
    public static final dmfu e;
    private static volatile dssr<dmfu> g;
    public int a;
    public int c;
    private byte f = 2;
    public String b = "";
    public String d = "";

    static {
        dmfu dmfuVar = new dmfu();
        e = dmfuVar;
        dsqw.cc(dmfu.class, dmfuVar);
    }

    private dmfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmfu();
            }
            if (i2 == 4) {
                return new dmft();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dmfu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmfu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
