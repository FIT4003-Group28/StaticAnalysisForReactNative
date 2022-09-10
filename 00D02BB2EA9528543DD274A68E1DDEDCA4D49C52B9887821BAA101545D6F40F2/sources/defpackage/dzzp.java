package defpackage;
/* compiled from: PG */
/* renamed from: dzzp  reason: default package */
/* loaded from: classes6.dex */
public final class dzzp extends dsqw<dzzp, dzzo> implements dssk {
    public static final dzzp d;
    private static volatile dssr<dzzp> e;
    public int a;
    public int b;
    public int c;

    static {
        dzzp dzzpVar = new dzzp();
        d = dzzpVar;
        dsqw.cc(dzzp.class, dzzpVar);
    }

    private dzzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dzzp();
            }
            if (i2 == 4) {
                return new dzzo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzzp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dzzp.class) {
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
