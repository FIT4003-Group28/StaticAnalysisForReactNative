package defpackage;
/* compiled from: PG */
/* renamed from: dtlr  reason: default package */
/* loaded from: classes6.dex */
public final class dtlr extends dsqw<dtlr, dtlq> implements dssk {
    public static final dtlr c;
    private static volatile dssr<dtlr> f;
    public dvzj a;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        dtlr dtlrVar = new dtlr();
        c = dtlrVar;
        dsqw.cc(dtlr.class, dtlrVar);
    }

    private dtlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dtlr();
            }
            if (i2 == 4) {
                return new dtlq();
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
            dssr<dtlr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtlr.class) {
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
