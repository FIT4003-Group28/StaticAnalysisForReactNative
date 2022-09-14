package defpackage;
/* compiled from: PG */
/* renamed from: duwb  reason: default package */
/* loaded from: classes6.dex */
public final class duwb extends dsqw<duwb, duwa> implements dssk {
    public static final duwb f;
    private static volatile dssr<duwb> g;
    public int a;
    public boolean b;
    public String c = "";
    public dpvk d;
    public dinw e;

    static {
        duwb duwbVar = new duwb();
        f = duwbVar;
        dsqw.cc(duwb.class, duwbVar);
    }

    private duwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new duwb();
            }
            if (i2 == 4) {
                return new duwa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duwb.class) {
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
