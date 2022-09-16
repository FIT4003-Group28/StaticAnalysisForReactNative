package defpackage;
/* compiled from: PG */
/* renamed from: dhrg  reason: default package */
/* loaded from: classes6.dex */
public final class dhrg extends dsqw<dhrg, dhrf> implements dssk {
    public static final dhrg a;
    private static volatile dssr<dhrg> b;

    static {
        dhrg dhrgVar = new dhrg();
        a = dhrgVar;
        dsqw.cc(dhrg.class, dhrgVar);
    }

    private dhrg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhrg();
            }
            if (i2 == 4) {
                return new dhrf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhrg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhrg.class) {
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
