package defpackage;
/* compiled from: PG */
/* renamed from: dsba  reason: default package */
/* loaded from: classes6.dex */
public final class dsba extends dsqw<dsba, dsaz> implements dssk {
    public static final dsba f;
    private static volatile dssr<dsba> g;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";
    public dsrj<String> e = dssu.b;

    static {
        dsba dsbaVar = new dsba();
        f = dsbaVar;
        dsqw.cc(dsba.class, dsbaVar);
    }

    private dsba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003\u001a\u0004ဈ\u0002", new Object[]{"c", "b", "a", dsay.class, drxv.a, "e", "d"});
            }
            if (i2 == 3) {
                return new dsba();
            }
            if (i2 == 4) {
                return new dsaz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsba> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsba.class) {
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
