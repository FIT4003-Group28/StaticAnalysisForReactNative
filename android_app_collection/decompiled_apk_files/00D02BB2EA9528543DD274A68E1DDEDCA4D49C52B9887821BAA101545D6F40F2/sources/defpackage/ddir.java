package defpackage;
/* compiled from: PG */
/* renamed from: ddir  reason: default package */
/* loaded from: classes5.dex */
public final class ddir extends dsqw<ddir, ddiq> implements dssk {
    public static final ddir d;
    private static volatile dssr<ddir> e;
    public int a;
    public long b;
    public int c;

    static {
        ddir ddirVar = new ddir();
        d = ddirVar;
        dsqw.cc(ddir.class, ddirVar);
    }

    private ddir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddir();
            }
            if (i2 == 4) {
                return new ddiq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddir> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddir.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
