package defpackage;
/* compiled from: PG */
/* renamed from: alsg  reason: default package */
/* loaded from: classes2.dex */
public final class alsg extends dsqw<alsg, alsf> implements dssk {
    public static final alsg d;
    private static volatile dssr<alsg> f;
    public float a;
    public float b;
    public float c;
    private int e;

    static {
        alsg alsgVar = new alsg();
        d = alsgVar;
        dsqw.cc(alsg.class, alsgVar);
    }

    private alsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new alsg();
            }
            if (i2 == 4) {
                return new alsf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<alsg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (alsg.class) {
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
