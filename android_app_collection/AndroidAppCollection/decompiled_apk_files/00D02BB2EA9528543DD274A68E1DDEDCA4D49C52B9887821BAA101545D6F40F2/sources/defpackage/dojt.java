package defpackage;
/* compiled from: PG */
/* renamed from: dojt  reason: default package */
/* loaded from: classes6.dex */
public final class dojt extends dsqw<dojt, dojc> implements dssk {
    public static final dojt f;
    private static volatile dssr<dojt> h;
    public int a;
    public Object c;
    public long d;
    public long e;
    public int b = 0;
    private byte g = 2;

    static {
        dojt dojtVar = new dojt();
        f = dojtVar;
        dsqw.cc(dojt.class, dojtVar);
    }

    private dojt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0000\u0002\u0001ဃ\u0000\u0002ြ\u0000\u0003ဂ\u0011\u0004ᐼ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000", new Object[]{"c", "b", "a", "d", dogl.class, "e", dolg.class, dolc.class, doky.class, dogt.class, dolt.class, domi.class, dokq.class, donm.class, dojg.class, dojb.class, doje.class, dojp.class, dojm.class, dojs.class, dojj.class});
            }
            if (i2 == 3) {
                return new dojt();
            }
            if (i2 == 4) {
                return new dojc();
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
            dssr<dojt> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dojt.class) {
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
