package defpackage;
/* compiled from: PG */
/* renamed from: dknu  reason: default package */
/* loaded from: classes6.dex */
public final class dknu extends dsqw<dknu, dknt> implements dssk {
    public static final dknu f;
    private static volatile dssr<dknu> g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;

    static {
        dknu dknuVar = new dknu();
        f = dknuVar;
        dsqw.cc(dknu.class, dknuVar);
    }

    private dknu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dknu();
            }
            if (i2 == 4) {
                return new dknt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dknu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
