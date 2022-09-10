package defpackage;
/* compiled from: PG */
/* renamed from: dlee  reason: default package */
/* loaded from: classes6.dex */
public final class dlee extends dsqw<dlee, dled> implements dssk {
    public static final dlee d;
    private static volatile dssr<dlee> f;
    public float a;
    public float b;
    public float c;
    private int e;

    static {
        dlee dleeVar = new dlee();
        d = dleeVar;
        dsqw.cc(dlee.class, dleeVar);
    }

    private dlee() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlee();
            }
            if (i2 == 4) {
                return new dled();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlee> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlee.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
