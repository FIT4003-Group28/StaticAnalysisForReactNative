package defpackage;
/* compiled from: PG */
/* renamed from: cyke  reason: default package */
/* loaded from: classes5.dex */
public final class cyke extends dsqw<cyke, cykb> implements dssk {
    public static final cyke f;
    private static volatile dssr<cyke> g;
    public String a = "";
    public dsrj<cyle> b = dssu.b;
    public dsrj<cyjo> c = dssu.b;
    public String d = "";
    public cykd e;

    static {
        cyke cykeVar = new cyke();
        f = cykeVar;
        dsqw.cc(cyke.class, cykeVar);
    }

    private cyke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0002\u0000\u0001Ȉ\u0003\u001b\u0004\u001b\u0005Ȉ\u0006\t", new Object[]{"a", "b", cyle.class, "c", cyjo.class, "d", "e"});
            }
            if (i2 == 3) {
                return new cyke();
            }
            if (i2 == 4) {
                return new cykb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyke> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cyke.class) {
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

    public final void b() {
        dsrj<cyle> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
