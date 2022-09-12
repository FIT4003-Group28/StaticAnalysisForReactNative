package defpackage;
/* compiled from: PG */
/* renamed from: djyy  reason: default package */
/* loaded from: classes6.dex */
public final class djyy extends dsqw<djyy, djyv> implements dssk {
    public static final djyy f;
    private static volatile dssr<djyy> h;
    public int a;
    public dvzd c;
    public djyx d;
    public dnqh e;
    private byte g = 2;
    public String b = "";

    static {
        djyy djyyVar = new djyy();
        f = djyyVar;
        dsqw.cc(djyy.class, djyyVar);
    }

    private djyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new djyy();
            }
            if (i2 == 4) {
                return new djyv();
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
            dssr<djyy> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djyy.class) {
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
