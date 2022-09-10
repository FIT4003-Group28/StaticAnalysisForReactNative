package defpackage;
/* compiled from: PG */
/* renamed from: dszk  reason: default package */
/* loaded from: classes6.dex */
public final class dszk extends dsqw<dszk, dszj> implements dssk {
    public static final dszk c;
    private static volatile dssr<dszk> d;
    public dxwk a;
    public dxnk b;

    static {
        dszk dszkVar = new dszk();
        c = dszkVar;
        dsqw.cc(dszk.class, dszkVar);
    }

    private dszk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dszk();
            }
            if (i2 == 4) {
                return new dszj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dszk.class) {
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
