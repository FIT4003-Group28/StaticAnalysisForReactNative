package defpackage;
/* compiled from: PG */
/* renamed from: dxse  reason: default package */
/* loaded from: classes6.dex */
public final class dxse extends dsqw<dxse, dxsd> implements dssk {
    public static final dxse f;
    private static volatile dssr<dxse> g;
    public dxsq b;
    public boolean e;
    public String a = "";
    public dsrj<dxso> c = dssu.b;
    public dsrj<dxsg> d = dssu.b;

    static {
        dxse dxseVar = new dxse();
        f = dxseVar;
        dsqw.cc(dxse.class, dxseVar);
    }

    private dxse() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\u001b\u0005\u0007", new Object[]{"a", "b", "c", dxso.class, "d", dxsg.class, "e"});
            }
            if (i2 == 3) {
                return new dxse();
            }
            if (i2 == 4) {
                return new dxsd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxse> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxse.class) {
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
