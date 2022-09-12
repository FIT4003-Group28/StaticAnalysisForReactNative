package defpackage;
/* compiled from: PG */
/* renamed from: dnkc  reason: default package */
/* loaded from: classes6.dex */
public final class dnkc extends dsqw<dnkc, dnjz> implements dssk {
    public static final dnkc h;
    private static volatile dssr<dnkc> i;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;
    public dnoh g;

    static {
        dnkc dnkcVar = new dnkc();
        h = dnkcVar;
        dsqw.cc(dnkc.class, dnkcVar);
    }

    private dnkc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", dnkb.c(), "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dnkc();
            }
            if (i3 == 4) {
                return new dnjz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnkc> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnkc.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
