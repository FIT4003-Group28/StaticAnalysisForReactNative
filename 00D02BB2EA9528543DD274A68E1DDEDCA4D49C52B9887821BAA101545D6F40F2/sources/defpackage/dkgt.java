package defpackage;
/* compiled from: PG */
/* renamed from: dkgt  reason: default package */
/* loaded from: classes.dex */
public final class dkgt extends dsqw<dkgt, dkgs> implements dssk {
    public static final dkgt c;
    private static volatile dssr<dkgt> e;
    public int a;
    public dsrj<dkjf> b = dssu.b;
    private int d;

    static {
        dkgt dkgtVar = new dkgt();
        c = dkgtVar;
        dsqw.cc(dkgt.class, dkgtVar);
    }

    private dkgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"d", "a", "b", dkjf.class});
            }
            if (i2 == 3) {
                return new dkgt();
            }
            if (i2 == 4) {
                return new dkgs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkgt.class) {
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
