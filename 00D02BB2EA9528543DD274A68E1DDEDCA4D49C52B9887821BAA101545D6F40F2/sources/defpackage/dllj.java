package defpackage;
/* compiled from: PG */
/* renamed from: dllj  reason: default package */
/* loaded from: classes6.dex */
public final class dllj extends dsqw<dllj, dlli> implements dssk {
    public static final dllj c;
    private static volatile dssr<dllj> e;
    public dpum a;
    public float b;
    private int d;

    static {
        dllj dlljVar = new dllj();
        c = dlljVar;
        dsqw.cc(dllj.class, dlljVar);
    }

    private dllj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dllj();
            }
            if (i2 == 4) {
                return new dlli();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dllj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}