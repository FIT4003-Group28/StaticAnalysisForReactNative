package defpackage;
/* compiled from: PG */
/* renamed from: dlet  reason: default package */
/* loaded from: classes6.dex */
public final class dlet extends dsqw<dlet, dlei> implements dssk {
    public static final dlet h;
    private static volatile dssr<dlet> i;
    public int a;
    public Object c;
    public int d;
    public long e;
    public int f;
    public int b = 0;
    public String g = "";

    static {
        dlet dletVar = new dlet();
        h = dletVar;
        dsqw.cc(dlet.class, dletVar);
    }

    private dlet() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0004ဈ\u0004\u0005ဂ\u0002\u0006င\u0003", new Object[]{"c", "b", "a", "d", dlel.a, dleq.class, "g", "e", "f"});
            }
            if (i3 == 3) {
                return new dlet();
            }
            if (i3 == 4) {
                return new dlei();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlet> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlet.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
