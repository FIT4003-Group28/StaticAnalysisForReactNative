package defpackage;
/* compiled from: PG */
/* renamed from: ddcs  reason: default package */
/* loaded from: classes.dex */
public final class ddcs extends dsqw<ddcs, ddcr> implements dssk {
    public static final ddcs d;
    private static volatile dssr<ddcs> f;
    public int a;
    public dtbk b;
    private byte e = 2;
    public String c = "";

    static {
        ddcs ddcsVar = new ddcs();
        d = ddcsVar;
        dsqw.cc(ddcs.class, ddcsVar);
    }

    private ddcs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddcs();
            }
            if (i2 == 4) {
                return new ddcr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<ddcs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddcs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
