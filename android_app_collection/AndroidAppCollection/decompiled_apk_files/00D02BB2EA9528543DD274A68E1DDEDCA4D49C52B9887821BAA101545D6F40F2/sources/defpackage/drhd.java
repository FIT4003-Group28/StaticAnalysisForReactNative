package defpackage;
/* compiled from: PG */
/* renamed from: drhd  reason: default package */
/* loaded from: classes6.dex */
public final class drhd extends dsqw<drhd, drha> implements dssk {
    public static final drhd c;
    private static volatile dssr<drhd> d;
    public dsrf a = dsqz.b;
    public dsrj<drhc> b = dssu.b;

    static {
        drhd drhdVar = new drhd();
        c = drhdVar;
        dsqw.cc(drhd.class, drhdVar);
    }

    private drhd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002\u001b", new Object[]{"a", "b", drhc.class});
            }
            if (i2 == 3) {
                return new drhd();
            }
            if (i2 == 4) {
                return new drha();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drhd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
