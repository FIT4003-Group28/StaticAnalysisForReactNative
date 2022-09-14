package defpackage;
/* compiled from: PG */
/* renamed from: dkrd  reason: default package */
/* loaded from: classes.dex */
public final class dkrd extends dsqw<dkrd, dkrc> implements dssk {
    public static final dkrd b;
    private static volatile dssr<dkrd> d;
    public dkhd a;
    private int c;

    static {
        dkrd dkrdVar = new dkrd();
        b = dkrdVar;
        dsqw.cc(dkrd.class, dkrdVar);
    }

    private dkrd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkrd();
            }
            if (i2 == 4) {
                return new dkrc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkrd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
