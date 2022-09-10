package defpackage;
/* compiled from: PG */
/* renamed from: cbuj  reason: default package */
/* loaded from: classes4.dex */
public final class cbuj extends dsqw<cbuj, cbui> implements dssk {
    public static final cbuj d;
    private static volatile dssr<cbuj> e;
    public int a;
    public dsrj<cbul> b = dssu.b;
    public int c;

    static {
        cbuj cbujVar = new cbuj();
        d = cbujVar;
        dsqw.cc(cbuj.class, cbujVar);
    }

    private cbuj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", cbul.class, "c"});
            }
            if (i2 == 3) {
                return new cbuj();
            }
            if (i2 == 4) {
                return new cbui();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbuj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cbuj.class) {
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
