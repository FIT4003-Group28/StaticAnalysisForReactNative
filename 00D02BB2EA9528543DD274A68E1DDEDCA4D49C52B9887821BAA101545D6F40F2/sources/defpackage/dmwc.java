package defpackage;
/* compiled from: PG */
/* renamed from: dmwc  reason: default package */
/* loaded from: classes.dex */
public final class dmwc extends dsqw<dmwc, dmvz> implements dssk {
    public static final dmwc f;
    private static volatile dssr<dmwc> h;
    public int a;
    public int c;
    public dmwl e;
    private int g;
    public dsrj<dmyp> b = dssu.b;
    public String d = "";

    static {
        dmwc dmwcVar = new dmwc();
        f = dmwcVar;
        dsqw.cc(dmwc.class, dmwcVar);
    }

    private dmwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0005ဌ\u0002\u0006ဈ\u0003\u0007ဉ\u0004", new Object[]{"g", "a", "b", dmyp.class, "c", dmwb.c(), "d", "e"});
            }
            if (i2 == 3) {
                return new dmwc();
            }
            if (i2 == 4) {
                return new dmvz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmwc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
