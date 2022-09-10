package defpackage;
/* compiled from: PG */
/* renamed from: dxvc  reason: default package */
/* loaded from: classes6.dex */
public final class dxvc extends dsqw<dxvc, dxvb> implements dssk {
    public static final dxvc e;
    private static volatile dssr<dxvc> f;
    public dxwi a;
    public dxur b;
    public int c;
    public String d = "";

    static {
        dxvc dxvcVar = new dxvc();
        e = dxvcVar;
        dsqw.cc(dxvc.class, dxvcVar);
    }

    private dxvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxvc();
            }
            if (i2 == 4) {
                return new dxvb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxvc.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
