package defpackage;
/* compiled from: PG */
/* renamed from: cyjo  reason: default package */
/* loaded from: classes5.dex */
public final class cyjo extends dsqw<cyjo, cyji> implements dssk {
    public static final cyjo g;
    private static volatile dssr<cyjo> h;
    public boolean c;
    public cyjt d;
    public boolean f;
    public String a = "";
    public String b = "";
    public dsrj<cyjn> e = dssu.b;

    static {
        cyjo cyjoVar = new cyjo();
        g = cyjoVar;
        dsqw.cc(cyjo.class, cyjoVar);
    }

    private cyjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\t\u0005\u001b\u0006\u0007", new Object[]{"a", "b", "c", "d", "e", cyjn.class, "f"});
            }
            if (i2 == 3) {
                return new cyjo();
            }
            if (i2 == 4) {
                return new cyji();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cyjo.class) {
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
