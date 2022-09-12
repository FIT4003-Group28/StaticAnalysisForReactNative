package defpackage;
/* compiled from: PG */
/* renamed from: dxnh  reason: default package */
/* loaded from: classes6.dex */
public final class dxnh extends dsqw<dxnh, dxnf> implements dssk {
    public static final dxnh f;
    private static volatile dssr<dxnh> g;
    public Object b;
    public dxnc c;
    public int a = 0;
    public dssd<String, String> d = dssd.b;
    public String e = "";

    static {
        dxnh dxnhVar = new dxnh();
        f = dxnhVar;
        dsqw.cc(dxnh.class, dxnhVar);
    }

    private dxnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0001\u0000\u0001f\u0005\u0001\u0000\u0000\u0001\t\u00022\u0003Ȉe<\u0000f<\u0000", new Object[]{"b", "a", "c", "d", dxng.a, "e", dxnr.class, dxmi.class});
            }
            if (i2 == 3) {
                return new dxnh();
            }
            if (i2 == 4) {
                return new dxnf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxnh.class) {
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
