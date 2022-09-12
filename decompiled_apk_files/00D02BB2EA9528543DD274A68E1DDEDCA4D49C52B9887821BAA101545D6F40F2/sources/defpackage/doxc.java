package defpackage;
/* compiled from: PG */
/* renamed from: doxc  reason: default package */
/* loaded from: classes6.dex */
public final class doxc extends dsqw<doxc, dowv> implements dssk {
    public static final doxc e;
    private static volatile dssr<doxc> g;
    public int a;
    public int b;
    public dowz d;
    private byte f = 2;
    public String c = "";

    static {
        doxc doxcVar = new doxc();
        e = doxcVar;
        dsqw.cc(doxc.class, doxcVar);
    }

    private doxc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", doxb.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new doxc();
            }
            if (i2 == 4) {
                return new dowv();
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
            dssr<doxc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doxc.class) {
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
