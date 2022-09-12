package defpackage;
/* compiled from: PG */
/* renamed from: dzye  reason: default package */
/* loaded from: classes.dex */
public final class dzye extends dsqw<dzye, dzyd> implements dssk {
    public static final dzye c;
    private static volatile dssr<dzye> e;
    public int a;
    public dzyc b;
    private byte d = 2;

    static {
        dzye dzyeVar = new dzye();
        c = dzyeVar;
        dsqw.cc(dzye.class, dzyeVar);
    }

    private dzye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dzye();
            }
            if (i2 == 4) {
                return new dzyd();
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
            dssr<dzye> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dzye.class) {
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
