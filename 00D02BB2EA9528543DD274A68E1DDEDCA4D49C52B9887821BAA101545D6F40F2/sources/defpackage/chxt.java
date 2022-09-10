package defpackage;
/* compiled from: PG */
/* renamed from: chxt  reason: default package */
/* loaded from: classes4.dex */
public final class chxt extends dsqw<chxt, chxs> implements dssk {
    public static final chxt c;
    private static volatile dssr<chxt> e;
    public int a;
    public chuu b;
    private byte d = 2;

    static {
        chxt chxtVar = new chxt();
        c = chxtVar;
        dsqw.cc(chxt.class, chxtVar);
    }

    private chxt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chxt();
            }
            if (i2 == 4) {
                return new chxs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<chxt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chxt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
