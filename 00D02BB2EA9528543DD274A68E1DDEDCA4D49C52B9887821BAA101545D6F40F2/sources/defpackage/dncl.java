package defpackage;
/* compiled from: PG */
/* renamed from: dncl  reason: default package */
/* loaded from: classes.dex */
public final class dncl extends dsqw<dncl, dnck> implements dssk {
    public static final dncl e;
    private static volatile dssr<dncl> h;
    public int a;
    public int c;
    public dncj d;
    private dgrt f;
    private byte g = 2;
    public String b = "";

    static {
        dncl dnclVar = new dncl();
        e = dnclVar;
        dsqw.cc(dncl.class, dnclVar);
    }

    private dncl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0017\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0006ᐉ\t\u0016ဌ\u0001\u0017ဉ\u000f", new Object[]{"a", "b", "f", "c", dpvf.c(), "d"});
            }
            if (i2 == 3) {
                return new dncl();
            }
            if (i2 == 4) {
                return new dnck();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dncl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dncl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
