package defpackage;
/* compiled from: PG */
/* renamed from: dkrl  reason: default package */
/* loaded from: classes.dex */
public final class dkrl extends dsqw<dkrl, dkrk> implements dssk {
    public static final dkrl g;
    private static volatile dssr<dkrl> h;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public String d = "";
    public String e = "";
    public int f;

    static {
        dkrl dkrlVar = new dkrl();
        g = dkrlVar;
        dsqw.cc(dkrl.class, dkrlVar);
    }

    private dkrl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005င\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dkrl();
            }
            if (i2 == 4) {
                return new dkrk();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkrl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
