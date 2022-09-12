package defpackage;
/* compiled from: PG */
/* renamed from: dmbn  reason: default package */
/* loaded from: classes6.dex */
public final class dmbn extends dsqw<dmbn, dmbk> implements dssk {
    public static final dmbn d;
    private static volatile dssr<dmbn> e;
    public int a;
    public dsrj<dmbm> b = dssu.b;
    public double c;

    static {
        dmbn dmbnVar = new dmbn();
        d = dmbnVar;
        dsqw.cc(dmbn.class, dmbnVar);
    }

    private dmbn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002က\u0000", new Object[]{"a", "b", dmbm.class, "c"});
            }
            if (i2 == 3) {
                return new dmbn();
            }
            if (i2 == 4) {
                return new dmbk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmbn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmbn.class) {
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
