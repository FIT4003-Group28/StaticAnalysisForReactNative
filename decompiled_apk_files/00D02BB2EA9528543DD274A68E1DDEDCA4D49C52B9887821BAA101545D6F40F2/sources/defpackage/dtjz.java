package defpackage;
/* compiled from: PG */
/* renamed from: dtjz  reason: default package */
/* loaded from: classes6.dex */
public final class dtjz extends dsqs<dtjz, dtjy> implements dsqt {
    public static final dtjz e;
    private static volatile dssr<dtjz> g;
    public int a;
    public dwbc b;
    public dthb c;
    private byte f = 2;
    public String d = "";

    static {
        dtjz dtjzVar = new dtjz();
        e = dtjzVar;
        dsqw.cc(dtjz.class, dtjzVar);
    }

    private dtjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtjz();
            }
            if (i2 == 4) {
                return new dtjy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dtjz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtjz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
