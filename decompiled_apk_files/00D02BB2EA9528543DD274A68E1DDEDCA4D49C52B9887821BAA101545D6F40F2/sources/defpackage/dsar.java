package defpackage;
/* compiled from: PG */
/* renamed from: dsar  reason: default package */
/* loaded from: classes6.dex */
public final class dsar extends dsqw<dsar, dsap> implements dssk {
    public static final dsar d;
    private static volatile dssr<dsar> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dsar dsarVar = new dsar();
        d = dsarVar;
        dsqw.cc(dsar.class, dsarVar);
    }

    private dsar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dsaq.a});
            }
            if (i2 == 3) {
                return new dsar();
            }
            if (i2 == 4) {
                return new dsap();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsar> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsar.class) {
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
