package defpackage;
/* compiled from: PG */
/* renamed from: dfmi  reason: default package */
/* loaded from: classes6.dex */
public final class dfmi extends dsqw<dfmi, dfmb> implements dssk {
    public static final dfmi d;
    private static volatile dssr<dfmi> g;
    public dgrh b;
    private int e;
    private byte f = 2;
    public dspd a = dspd.b;
    public dsrj<dfmh> c = dssu.b;

    static {
        dfmi dfmiVar = new dfmi();
        d = dfmiVar;
        dsqw.cc(dfmi.class, dfmiVar);
    }

    private dfmi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ည\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"e", "a", "c", dfmh.class, "b"});
            }
            if (i2 == 3) {
                return new dfmi();
            }
            if (i2 == 4) {
                return new dfmb();
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
            dssr<dfmi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfmi.class) {
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
