package defpackage;
/* compiled from: PG */
/* renamed from: cbub  reason: default package */
/* loaded from: classes4.dex */
public final class cbub extends dsqw<cbub, cbua> implements dssk {
    public static final cbub e;
    private static volatile dssr<cbub> f;
    public int a;
    public dsrj<cbud> b = dssu.b;
    public int c;
    public boolean d;

    static {
        cbub cbubVar = new cbub();
        e = cbubVar;
        dsqw.cc(cbub.class, cbubVar);
    }

    private cbub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဇ\u0001", new Object[]{"a", "b", cbud.class, "c", "d"});
            }
            if (i2 == 3) {
                return new cbub();
            }
            if (i2 == 4) {
                return new cbua();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbub> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cbub.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
