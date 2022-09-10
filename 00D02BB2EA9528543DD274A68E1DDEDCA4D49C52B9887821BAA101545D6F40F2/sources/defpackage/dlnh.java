package defpackage;
/* compiled from: PG */
/* renamed from: dlnh  reason: default package */
/* loaded from: classes6.dex */
public final class dlnh extends dsqw<dlnh, dlne> implements dssk {
    public static final dlnh d;
    private static volatile dssr<dlnh> e;
    public int a;
    public String b = "";
    public dsrj<dlng> c = dssu.b;

    static {
        dlnh dlnhVar = new dlnh();
        d = dlnhVar;
        dsqw.cc(dlnh.class, dlnhVar);
    }

    private dlnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dlng.class});
            }
            if (i2 == 3) {
                return new dlnh();
            }
            if (i2 == 4) {
                return new dlne();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlnh.class) {
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
