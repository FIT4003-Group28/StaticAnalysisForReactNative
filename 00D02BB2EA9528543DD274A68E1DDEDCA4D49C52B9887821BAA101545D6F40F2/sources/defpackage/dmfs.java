package defpackage;
/* compiled from: PG */
/* renamed from: dmfs  reason: default package */
/* loaded from: classes6.dex */
public final class dmfs extends dsqs<dmfs, dmfr> implements dsqt {
    public static final dmfs c;
    private static volatile dssr<dmfs> f;
    public dqjt b;
    private int d;
    private byte e = 2;
    public String a = "";

    static {
        dmfs dmfsVar = new dmfs();
        c = dmfsVar;
        dsqw.cc(dmfs.class, dmfsVar);
    }

    private dmfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmfs();
            }
            if (i2 == 4) {
                return new dmfr();
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
            dssr<dmfs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmfs.class) {
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
