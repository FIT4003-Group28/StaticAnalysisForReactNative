package defpackage;
/* compiled from: PG */
/* renamed from: dirb  reason: default package */
/* loaded from: classes6.dex */
public final class dirb extends dsqs<dirb, dira> implements dsqt {
    public static final dirb l;
    private static volatile dssr<dirb> n;
    public int a;
    public dnqh b;
    public dhjx c;
    public dnwb f;
    public diwd j;
    private byte m = 2;
    public dspd d = dspd.b;
    public dspd e = dspd.b;
    public dspd g = dspd.b;
    public dsrj<String> h = dssu.b;
    public int i = 10;
    public int k = 1;

    static {
        dirb dirbVar = new dirb();
        l = dirbVar;
        dsqw.cc(dirb.class, dirbVar);
    }

    private dirb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ည\u0002\bည\u0007\tင\b\fဉ\n\rဉ\u0006\u000eည\u0003\u000fဌ\u000b\u0010\u001a", new Object[]{"a", "b", "c", "d", "g", "i", "j", "f", "e", "k", dpwg.a, "h"});
            }
            if (i2 == 3) {
                return new dirb();
            }
            if (i2 == 4) {
                return new dira();
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
            dssr<dirb> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dirb.class) {
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
