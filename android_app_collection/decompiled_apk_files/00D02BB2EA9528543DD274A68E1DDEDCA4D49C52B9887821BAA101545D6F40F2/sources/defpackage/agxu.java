package defpackage;
/* compiled from: PG */
/* renamed from: agxu  reason: default package */
/* loaded from: classes2.dex */
public final class agxu extends dsqw<agxu, agxt> implements dssk {
    public static final agxu c;
    private static volatile dssr<agxu> d;
    public int a;
    public int b;

    static {
        agxu agxuVar = new agxu();
        c = agxuVar;
        dsqw.cc(agxu.class, agxuVar);
    }

    private agxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new agxu();
            }
            if (i2 == 4) {
                return new agxt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agxu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (agxu.class) {
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
