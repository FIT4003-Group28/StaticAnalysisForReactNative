package defpackage;
/* compiled from: PG */
/* renamed from: dovn  reason: default package */
/* loaded from: classes6.dex */
public final class dovn extends dsqw<dovn, dovk> implements dssk {
    public static final dovn e;
    private static volatile dssr<dovn> g;
    public int a;
    public douj b;
    public int d;
    private byte f = 2;
    public String c = "";

    static {
        dovn dovnVar = new dovn();
        e = dovnVar;
        dsqw.cc(dovn.class, dovnVar);
    }

    private dovn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဌ\u0002\u0003ᐉ\u0000", new Object[]{"a", "c", "d", dovl.a, "b"});
            }
            if (i2 == 3) {
                return new dovn();
            }
            if (i2 == 4) {
                return new dovk();
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
            dssr<dovn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dovn.class) {
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
