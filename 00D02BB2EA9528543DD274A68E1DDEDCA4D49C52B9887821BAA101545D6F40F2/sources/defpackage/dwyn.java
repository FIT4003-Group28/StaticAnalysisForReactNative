package defpackage;
/* compiled from: PG */
/* renamed from: dwyn  reason: default package */
/* loaded from: classes6.dex */
public final class dwyn extends dsqw<dwyn, dwym> implements dssk {
    public static final dwyn d;
    private static volatile dssr<dwyn> f;
    public int a;
    public long b;
    public int c;
    private byte e = 2;

    static {
        dwyn dwynVar = new dwyn();
        d = dwynVar;
        dsqw.cc(dwyn.class, dwynVar);
    }

    private dwyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဏ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwyn();
            }
            if (i2 == 4) {
                return new dwym();
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
            dssr<dwyn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwyn.class) {
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
