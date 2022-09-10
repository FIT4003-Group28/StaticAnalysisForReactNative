package defpackage;
/* compiled from: PG */
/* renamed from: dizx  reason: default package */
/* loaded from: classes.dex */
public final class dizx extends dsqw<dizx, dizu> implements dssk {
    public static final dizx d;
    private static volatile dssr<dizx> g;
    public boolean a;
    public int b;
    public dizw c;
    private int e;
    private byte f = 2;

    static {
        dizx dizxVar = new dizx();
        d = dizxVar;
        dsqw.cc(dizx.class, dizxVar);
    }

    private dizx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002င\u0001\u0003ဇ\u0000\u0004ᐉ\u0002", new Object[]{"e", "b", "a", "c"});
            }
            if (i2 == 3) {
                return new dizx();
            }
            if (i2 == 4) {
                return new dizu();
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
            dssr<dizx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dizx.class) {
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
