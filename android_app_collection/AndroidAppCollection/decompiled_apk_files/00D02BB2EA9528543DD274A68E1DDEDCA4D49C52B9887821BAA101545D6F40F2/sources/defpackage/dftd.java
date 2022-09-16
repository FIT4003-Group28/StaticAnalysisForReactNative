package defpackage;
/* compiled from: PG */
/* renamed from: dftd  reason: default package */
/* loaded from: classes6.dex */
public final class dftd extends dsqw<dftd, dftc> implements dssk {
    public static final dftd d;
    private static volatile dssr<dftd> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dftd dftdVar = new dftd();
        d = dftdVar;
        dsqw.cc(dftd.class, dftdVar);
    }

    private dftd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dfsl.a, "c"});
            }
            if (i2 == 3) {
                return new dftd();
            }
            if (i2 == 4) {
                return new dftc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dftd.class) {
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
