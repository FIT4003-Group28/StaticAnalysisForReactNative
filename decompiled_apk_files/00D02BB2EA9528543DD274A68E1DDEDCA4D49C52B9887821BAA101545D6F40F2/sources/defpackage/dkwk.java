package defpackage;
/* compiled from: PG */
/* renamed from: dkwk  reason: default package */
/* loaded from: classes6.dex */
public final class dkwk extends dsqw<dkwk, dkwj> implements dssk {
    public static final dkwk a;
    private static volatile dssr<dkwk> d;
    private int b;
    private dqvo c;

    static {
        dkwk dkwkVar = new dkwk();
        a = dkwkVar;
        dsqw.cc(dkwk.class, dkwkVar);
    }

    private dkwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkwk();
            }
            if (i2 == 4) {
                return new dkwj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkwk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
