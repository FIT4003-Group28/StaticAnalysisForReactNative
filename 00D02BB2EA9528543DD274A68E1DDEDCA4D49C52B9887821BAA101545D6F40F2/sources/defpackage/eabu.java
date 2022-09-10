package defpackage;
/* compiled from: PG */
/* renamed from: eabu  reason: default package */
/* loaded from: classes.dex */
public final class eabu extends dsqw<eabu, eabq> implements dssk {
    public static final eabu d;
    private static volatile dssr<eabu> g;
    public int a;
    public int b;
    private eabs e;
    private byte f = 2;
    public int c = 1;

    static {
        eabu eabuVar = new eabu();
        d = eabuVar;
        dsqw.cc(eabu.class, eabuVar);
    }

    private eabu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", eabt.a, "c", "e"});
            }
            if (i2 == 3) {
                return new eabu();
            }
            if (i2 == 4) {
                return new eabq();
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
            dssr<eabu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eabu.class) {
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
