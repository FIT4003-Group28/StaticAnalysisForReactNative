package defpackage;
/* compiled from: PG */
/* renamed from: dsyn  reason: default package */
/* loaded from: classes6.dex */
public final class dsyn extends dsqs<dsyn, dsym> implements dsqt {
    public static final dsyn e;
    private static volatile dssr<dsyn> g;
    public int a;
    public dsws b;
    public dsok d;
    private byte f = 2;
    public String c = "";

    static {
        dsyn dsynVar = new dsyn();
        e = dsynVar;
        dsqw.cc(dsyn.class, dsynVar);
    }

    private dsyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0006ဉ\u0000", new Object[]{"a", "c", "d", "b"});
            }
            if (i2 == 3) {
                return new dsyn();
            }
            if (i2 == 4) {
                return new dsym();
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
            dssr<dsyn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsyn.class) {
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
