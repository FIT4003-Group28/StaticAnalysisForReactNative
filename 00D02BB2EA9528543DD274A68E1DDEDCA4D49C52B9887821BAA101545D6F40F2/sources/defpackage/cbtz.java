package defpackage;
/* compiled from: PG */
/* renamed from: cbtz  reason: default package */
/* loaded from: classes4.dex */
public final class cbtz extends dsqw<cbtz, cbty> implements dssk {
    public static final cbtz f;
    private static volatile dssr<cbtz> g;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public int d = 1;
    public int e;

    static {
        cbtz cbtzVar = new cbtz();
        f = cbtzVar;
        dsqw.cc(cbtz.class, cbtzVar);
    }

    private cbtz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဌ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d", cbug.a, "e"});
            }
            if (i2 == 3) {
                return new cbtz();
            }
            if (i2 == 4) {
                return new cbty();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbtz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cbtz.class) {
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
