package defpackage;
/* compiled from: PG */
/* renamed from: dkxn  reason: default package */
/* loaded from: classes.dex */
public final class dkxn extends dsqw<dkxn, dkxk> implements dssk {
    public static final dkxn g;
    private static volatile dssr<dkxn> i;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e = 1;
    public boolean f;
    private int h;

    static {
        dkxn dkxnVar = new dkxn();
        g = dkxnVar;
        dsqw.cc(dkxn.class, dkxnVar);
    }

    private dkxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0007\bဌ\b\tဇ\t", new Object[]{"h", "a", "b", "c", "d", "e", dkxl.a, "f"});
            }
            if (i3 == 3) {
                return new dkxn();
            }
            if (i3 == 4) {
                return new dkxk();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkxn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkxn.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
