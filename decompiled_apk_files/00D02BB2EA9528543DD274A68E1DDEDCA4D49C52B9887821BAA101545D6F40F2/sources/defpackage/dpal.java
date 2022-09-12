package defpackage;
/* compiled from: PG */
/* renamed from: dpal  reason: default package */
/* loaded from: classes6.dex */
public final class dpal extends dsqw<dpal, dpak> implements dssk {
    public static final dpal e;
    private static volatile dssr<dpal> g;
    public int a;
    public dpjn b;
    public dpie c;
    public doud d;
    private byte f = 2;

    static {
        dpal dpalVar = new dpal();
        e = dpalVar;
        dsqw.cc(dpal.class, dpalVar);
    }

    private dpal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpal();
            }
            if (i2 == 4) {
                return new dpak();
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
            dssr<dpal> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpal.class) {
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
