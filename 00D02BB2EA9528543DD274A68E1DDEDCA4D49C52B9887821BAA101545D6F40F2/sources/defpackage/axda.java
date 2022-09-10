package defpackage;
/* compiled from: PG */
/* renamed from: axda  reason: default package */
/* loaded from: classes3.dex */
public final class axda extends dsqw<axda, axcz> implements dssk {
    public static final axda e;
    private static volatile dssr<axda> g;
    public int a;
    public long b;
    public dvhg c;
    public dviq d;
    private byte f = 2;

    static {
        axda axdaVar = new axda();
        e = axdaVar;
        dsqw.cc(axda.class, axdaVar);
    }

    private axda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axda();
            }
            if (i2 == 4) {
                return new axcz();
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
            dssr<axda> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axda.class) {
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
