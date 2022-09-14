package defpackage;
/* compiled from: PG */
/* renamed from: dndp  reason: default package */
/* loaded from: classes6.dex */
public final class dndp extends dsqw<dndp, dndo> implements dssk {
    public static final dndp f;
    private static volatile dssr<dndp> g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public dsrj<dndj> e = dssu.b;

    static {
        dndp dndpVar = new dndp();
        f = dndpVar;
        dsqw.cc(dndp.class, dndpVar);
    }

    private dndp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u001b\u0004ဇ\u0002", new Object[]{"a", "b", "c", "e", dndj.class, "d"});
            }
            if (i2 == 3) {
                return new dndp();
            }
            if (i2 == 4) {
                return new dndo();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dndp.class) {
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
