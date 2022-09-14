package defpackage;
/* compiled from: PG */
/* renamed from: amze  reason: default package */
/* loaded from: classes.dex */
public final class amze extends dsqw<amze, amzd> implements dssk {
    public static final amze o;
    private static volatile dssr<amze> q;
    public int a;
    public amza b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long l;
    public boolean n;
    private byte p = 2;
    public String k = "";
    public dspd m = dspd.b;

    static {
        amze amzeVar = new amze();
        o = amzeVar;
        dsqw.cc(amze.class, amzeVar);
    }

    private amze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bင\u0007\tင\b\nဈ\t\u000bဂ\n\fည\u000b\rဇ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new amze();
            }
            if (i2 == 4) {
                return new amzd();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            }
            dssr<amze> dssrVar = q;
            if (dssrVar == null) {
                synchronized (amze.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.p);
    }
}
