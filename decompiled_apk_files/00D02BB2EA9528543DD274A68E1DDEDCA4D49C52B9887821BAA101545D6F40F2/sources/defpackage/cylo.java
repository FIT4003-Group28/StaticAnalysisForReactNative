package defpackage;
/* compiled from: PG */
/* renamed from: cylo  reason: default package */
/* loaded from: classes5.dex */
public final class cylo extends dsqw<cylo, cyll> implements dssk {
    public static final cylo k;
    private static volatile dssr<cylo> l;
    public String a = "";
    public dsrj<cyle> b = dssu.b;
    public dsrj<cyls> c = dssu.b;
    public dsrj<cyjo> d = dssu.b;
    public dsrj<cylq> e = dssu.b;
    public dsrj<cykl> f = dssu.b;
    public dsrj<String> g = dssu.b;
    public dsrj<cylz> h = dssu.b;
    public dsrj<cyil> i = dssu.b;
    public cyln j;

    static {
        cylo cyloVar = new cylo();
        k = cyloVar;
        dsqw.cc(cylo.class, cyloVar);
    }

    private cylo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0000\n\u0000\u0000\u0001\n\n\u0000\b\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007Ț\b\u001b\t\u001b\n\t", new Object[]{"a", "b", cyle.class, "c", cyls.class, "d", cyjo.class, "e", cylq.class, "f", cykl.class, "g", "h", cylz.class, "i", cyil.class, "j"});
            }
            if (i2 == 3) {
                return new cylo();
            }
            if (i2 == 4) {
                return new cyll();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cylo> dssrVar = l;
            if (dssrVar == null) {
                synchronized (cylo.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
