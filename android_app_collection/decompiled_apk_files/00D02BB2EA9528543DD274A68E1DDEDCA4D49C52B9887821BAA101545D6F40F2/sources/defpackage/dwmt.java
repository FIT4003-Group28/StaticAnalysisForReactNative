package defpackage;
/* compiled from: PG */
/* renamed from: dwmt  reason: default package */
/* loaded from: classes6.dex */
public final class dwmt extends dsqw<dwmt, dwmq> implements dssk {
    public static final dwmt d;
    private static volatile dssr<dwmt> g;
    public dwla b;
    public int c;
    private int e;
    private byte f = 2;
    public String a = "";

    static {
        dwmt dwmtVar = new dwmt();
        d = dwmtVar;
        dsqw.cc(dwmt.class, dwmtVar);
    }

    private dwmt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dwmr.a});
            }
            if (i2 == 3) {
                return new dwmt();
            }
            if (i2 == 4) {
                return new dwmq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dwmt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwmt.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
