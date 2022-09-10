package defpackage;
/* compiled from: PG */
/* renamed from: dral  reason: default package */
/* loaded from: classes.dex */
public final class dral extends dsqw<dral, drak> implements dssk {
    public static final dral b;
    private static volatile dssr<dral> c;
    public dsrj<draj> a = dssu.b;

    static {
        dral dralVar = new dral();
        b = dralVar;
        dsqw.cc(dral.class, dralVar);
    }

    private dral() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", draj.class});
            }
            if (i2 == 3) {
                return new dral();
            }
            if (i2 == 4) {
                return new drak();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dral> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dral.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
