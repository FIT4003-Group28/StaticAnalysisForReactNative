package defpackage;
/* compiled from: PG */
/* renamed from: dkro  reason: default package */
/* loaded from: classes.dex */
public final class dkro extends dsqw<dkro, dkrh> implements dssk {
    public static final dkro h;
    private static volatile dssr<dkro> i;
    public int a;
    public dsrj<dkrj> b = dssu.b;
    public int c = 600;
    public int d = 7200;
    public int e = 7200;
    public dkrn f;
    public boolean g;

    static {
        dkro dkroVar = new dkro();
        h = dkroVar;
        dsqw.cc(dkro.class, dkroVar);
    }

    private dkro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002င\u0001\u0003င\u0003\u0004ဉ\u0004\u0005ဇ\u0006\u0006င\u0002", new Object[]{"a", "b", dkrj.class, "c", "e", "f", "g", "d"});
            }
            if (i3 == 3) {
                return new dkro();
            }
            if (i3 == 4) {
                return new dkrh();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkro> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkro.class) {
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
