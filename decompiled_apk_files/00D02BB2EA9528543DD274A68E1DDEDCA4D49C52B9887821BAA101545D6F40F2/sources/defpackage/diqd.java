package defpackage;
/* compiled from: PG */
/* renamed from: diqd  reason: default package */
/* loaded from: classes6.dex */
public final class diqd extends dsqw<diqd, diqc> implements dssk {
    public static final diqd a;
    private static volatile dssr<diqd> b;

    static {
        diqd diqdVar = new diqd();
        a = diqdVar;
        dsqw.cc(diqd.class, diqdVar);
    }

    private diqd() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diqd();
            }
            if (i2 == 4) {
                return new diqc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diqd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diqd.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
