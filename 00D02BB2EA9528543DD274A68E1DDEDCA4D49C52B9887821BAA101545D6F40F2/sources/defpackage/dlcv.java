package defpackage;
/* compiled from: PG */
/* renamed from: dlcv  reason: default package */
/* loaded from: classes6.dex */
public final class dlcv extends dsqs<dlcv, dlct> implements dsqt {
    public static final dlcv j;
    private static volatile dssr<dlcv> l;
    public int a;
    public Object c;
    public long e;
    public dlam g;
    public dqhj h;
    public boolean i;
    public int b = 0;
    private byte k = 2;
    public dspd d = dspd.b;
    public String f = "";

    static {
        dlcv dlcvVar = new dlcv();
        j = dlcvVar;
        dsqw.cc(dlcv.class, dlcvVar);
    }

    private dlcv() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\u001a\u0001\u0001\u0001\u001d\u001a\u0000\u0000\u0012\u0001ည\u0001\u0002ᐼ\u0000\u0003ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ဉ\u0018\bဂ\u0002\nᐼ\u0000\u000bဇ\u001b\fᐼ\u0000\rᐼ\u0000\u000eᐼ\u0000\u000fᐼ\u0000\u0010ᐼ\u0000\u0011ြ\u0000\u0012ᐼ\u0000\u0013ဉ\u001a\u0014ᐼ\u0000\u0015ᐼ\u0000\u0016ᐼ\u0000\u0017ᐼ\u0000\u0018ᐼ\u0000\u001aᐼ\u0000\u001bြ\u0000\u001cᐼ\u0000\u001dဈ\u0003", new Object[]{"c", "b", "a", "d", dlbw.class, dlba.class, dlby.class, dlbe.class, "g", "e", dldh.class, "i", dlci.class, dlaw.class, dlcq.class, dldb.class, dlcg.class, dkzw.class, dldp.class, "h", dlbg.class, dldx.class, dldt.class, dlcc.class, dkzu.class, dlce.class, dlco.class, dlcq.class, "f"});
            }
            if (i2 == 3) {
                return new dlcv();
            }
            if (i2 == 4) {
                return new dlct();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dlcv> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dlcv.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
