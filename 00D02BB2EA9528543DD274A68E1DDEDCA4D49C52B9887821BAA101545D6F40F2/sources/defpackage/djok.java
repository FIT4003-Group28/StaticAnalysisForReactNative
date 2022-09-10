package defpackage;
/* compiled from: PG */
/* renamed from: djok  reason: default package */
/* loaded from: classes6.dex */
public final class djok extends dsqs<djok, djoj> implements dsqt {
    public static final djok c;
    private static volatile dssr<djok> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        djok djokVar = new djok();
        c = djokVar;
        dsqw.cc(djok.class, djokVar);
    }

    private djok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0002", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new djok();
            }
            if (i2 == 4) {
                return new djoj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<djok> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djok.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
