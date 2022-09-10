package defpackage;
/* compiled from: PG */
/* renamed from: chuu  reason: default package */
/* loaded from: classes4.dex */
public final class chuu extends dsqw<chuu, chud> implements dssk {
    public static final chuu l;
    private static volatile dssr<chuu> n;
    public int a;
    public int b;
    public int c;
    public int d;
    public chuc i;
    public chuh j;
    public chut k;
    private byte m = 2;
    public dsrj<drrv> e = dssu.b;
    public dspd f = dspd.b;
    public dsrj<chuj> g = dssu.b;
    public dsrj<chxl> h = dssu.b;

    static {
        chuu chuuVar = new chuu();
        l = chuuVar;
        dsqw.cc(chuu.class, chuuVar);
    }

    private chuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0001\u0001ဌ\u0003\u0002ဉ\u0005\u0003\u001b\u0004Л\u0005\u001b\u0006ည\u0004\bဌ\u0001\tဉ\u0006\nဉ\u0007\u000bဌ\u0002", new Object[]{"a", "d", drrx.c(), "i", "g", chuj.class, "h", chxl.class, "e", drrv.class, "f", "b", dpyv.c(), "j", "k", "c", dwyd.c()});
            }
            if (i2 == 3) {
                return new chuu();
            }
            if (i2 == 4) {
                return new chud();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<chuu> dssrVar = n;
            if (dssrVar == null) {
                synchronized (chuu.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
