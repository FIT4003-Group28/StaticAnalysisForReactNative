package defpackage;
/* compiled from: PG */
/* renamed from: dsgd  reason: default package */
/* loaded from: classes6.dex */
public final class dsgd extends dsqw<dsgd, dsgc> implements dssk {
    public static final dsgd d;
    private static volatile dssr<dsgd> e;
    public int a;
    public dspd b = dspd.b;
    public double c;

    static {
        dsgd dsgdVar = new dsgd();
        d = dsgdVar;
        dsqw.cc(dsgd.class, dsgdVar);
    }

    private dsgd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsgd();
            }
            if (i2 == 4) {
                return new dsgc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsgd.class) {
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
