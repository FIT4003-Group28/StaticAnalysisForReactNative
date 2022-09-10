package defpackage;
/* compiled from: PG */
/* renamed from: drib  reason: default package */
/* loaded from: classes6.dex */
public final class drib extends dsqw<drib, dria> implements dssk {
    public static final drib a;
    private static volatile dssr<drib> b;

    static {
        drib dribVar = new drib();
        a = dribVar;
        dsqw.cc(drib.class, dribVar);
    }

    private drib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drib();
            }
            if (i2 == 4) {
                return new dria();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drib> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drib.class) {
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
