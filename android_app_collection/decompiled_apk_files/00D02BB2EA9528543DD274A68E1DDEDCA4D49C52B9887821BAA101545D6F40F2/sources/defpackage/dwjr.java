package defpackage;
/* compiled from: PG */
/* renamed from: dwjr  reason: default package */
/* loaded from: classes6.dex */
public final class dwjr extends dsqw<dwjr, dwjq> implements dssk {
    public static final dwjr c;
    private static volatile dssr<dwjr> f;
    public int a;
    public dhjx b;
    private dnqh d;
    private byte e = 2;

    static {
        dwjr dwjrVar = new dwjr();
        c = dwjrVar;
        dsqw.cc(dwjr.class, dwjrVar);
    }

    private dwjr() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0006ᐉ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dwjr();
            }
            if (i2 == 4) {
                return new dwjq();
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
            dssr<dwjr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwjr.class) {
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
