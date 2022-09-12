package defpackage;
/* compiled from: PG */
/* renamed from: dsyy  reason: default package */
/* loaded from: classes6.dex */
public final class dsyy extends dsqw<dsyy, dsyx> implements dssk {
    public static final dsyy c;
    private static volatile dssr<dsyy> d;
    public int a;
    public boolean b;

    static {
        dsyy dsyyVar = new dsyy();
        c = dsyyVar;
        dsqw.cc(dsyy.class, dsyyVar);
    }

    private dsyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsyy();
            }
            if (i2 == 4) {
                return new dsyx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsyy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsyy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
