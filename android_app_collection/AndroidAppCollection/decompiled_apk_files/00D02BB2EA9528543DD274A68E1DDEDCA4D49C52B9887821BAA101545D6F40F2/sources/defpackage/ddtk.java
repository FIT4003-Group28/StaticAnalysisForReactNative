package defpackage;
/* compiled from: PG */
/* renamed from: ddtk  reason: default package */
/* loaded from: classes6.dex */
public final class ddtk extends dsqw<ddtk, ddtb> implements dssk {
    public static final ddtk f;
    private static volatile dssr<ddtk> g;
    public dsrj<ddtf> a = dssu.b;
    public dsrj<ddtd> b = dssu.b;
    public dsrj<ddtf> c = dssu.b;
    public dsrj<ddth> d = dssu.b;
    public dsrj<ddth> e = dssu.b;

    static {
        ddtk ddtkVar = new ddtk();
        f = ddtkVar;
        dsqw.cc(ddtk.class, ddtkVar);
    }

    private ddtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"a", ddtf.class, "b", ddtd.class, "c", ddtf.class, "d", ddth.class, "e", ddth.class});
            }
            if (i2 == 3) {
                return new ddtk();
            }
            if (i2 == 4) {
                return new ddtb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddtk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
