package defpackage;
/* compiled from: PG */
/* renamed from: doxn  reason: default package */
/* loaded from: classes6.dex */
public final class doxn extends dsqw<doxn, doxm> implements dssk {
    public static final doxn d;
    private static volatile dssr<doxn> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        doxn doxnVar = new doxn();
        d = doxnVar;
        dsqw.cc(doxn.class, doxnVar);
    }

    private doxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new doxn();
            }
            if (i2 == 4) {
                return new doxm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doxn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
