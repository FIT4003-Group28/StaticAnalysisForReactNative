package defpackage;
/* compiled from: PG */
/* renamed from: djce  reason: default package */
/* loaded from: classes6.dex */
public final class djce extends dsqw<djce, djbm> implements dssk {
    public static final djce f;
    private static volatile dssr<djce> h;
    public int a;
    public int b;
    private byte g = 2;
    public dsrj<djcb> c = dssu.b;
    public String d = "";
    public String e = "";

    static {
        djce djceVar = new djce();
        f = djceVar;
        dsqw.cc(djce.class, djceVar);
    }

    private djce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л\u0003ဈ\u0001\u0005ဈ\u0003", new Object[]{"a", "b", djcc.a, "c", djcb.class, "d", "e"});
            }
            if (i2 == 3) {
                return new djce();
            }
            if (i2 == 4) {
                return new djbm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<djce> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djce.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
