package defpackage;
/* compiled from: PG */
/* renamed from: djmt  reason: default package */
/* loaded from: classes6.dex */
public final class djmt extends dsqw<djmt, djms> implements dssk {
    public static final djmt a;
    private static volatile dssr<djmt> b;

    static {
        djmt djmtVar = new djmt();
        a = djmtVar;
        dsqw.cc(djmt.class, djmtVar);
    }

    private djmt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djmt();
            }
            if (i2 == 4) {
                return new djms();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djmt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djmt.class) {
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
