package defpackage;
/* compiled from: PG */
/* renamed from: dhyl  reason: default package */
/* loaded from: classes6.dex */
public final class dhyl extends dsqw<dhyl, dhyj> implements dssk {
    public static final dhyl c;
    private static volatile dssr<dhyl> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dhyl dhylVar = new dhyl();
        c = dhylVar;
        dsqw.cc(dhyl.class, dhylVar);
    }

    private dhyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0004\u0001\u0000\u000b\u000e\u0004\u0000\u0000\u0002\u000bᐼ\u0000\fᐼ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"b", "a", djrs.class, djcy.class, drjw.class, djnk.class});
            }
            if (i2 == 3) {
                return new dhyl();
            }
            if (i2 == 4) {
                return new dhyj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhyl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhyl.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
