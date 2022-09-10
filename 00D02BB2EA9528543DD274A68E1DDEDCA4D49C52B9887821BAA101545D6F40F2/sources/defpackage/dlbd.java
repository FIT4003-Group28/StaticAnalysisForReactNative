package defpackage;
/* compiled from: PG */
/* renamed from: dlbd  reason: default package */
/* loaded from: classes6.dex */
public final class dlbd extends dsqw<dlbd, dlbc> implements dssk {
    public static final dlbd d;
    private static volatile dssr<dlbd> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dlbd dlbdVar = new dlbd();
        d = dlbdVar;
        dsqw.cc(dlbd.class, dlbdVar);
    }

    private dlbd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlbd();
            }
            if (i2 == 4) {
                return new dlbc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlbd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlbd.class) {
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
