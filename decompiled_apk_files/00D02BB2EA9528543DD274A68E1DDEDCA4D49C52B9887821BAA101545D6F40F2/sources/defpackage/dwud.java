package defpackage;
/* compiled from: PG */
/* renamed from: dwud  reason: default package */
/* loaded from: classes6.dex */
public final class dwud extends dsqw<dwud, dwuc> implements dssk {
    public static final dwud d;
    private static volatile dssr<dwud> f;
    public String a = "";
    public String b = "";
    public int c;
    private int e;

    static {
        dwud dwudVar = new dwud();
        d = dwudVar;
        dsqw.cc(dwud.class, dwudVar);
    }

    private dwud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dwub.c()});
            }
            if (i2 == 3) {
                return new dwud();
            }
            if (i2 == 4) {
                return new dwuc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwud> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwud.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
