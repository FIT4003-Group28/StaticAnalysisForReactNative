package defpackage;
/* compiled from: PG */
/* renamed from: dryh  reason: default package */
/* loaded from: classes6.dex */
public final class dryh extends dsqw<dryh, dryg> implements dssk {
    public static final dryh e;
    private static volatile dssr<dryh> f;
    public int a;
    public dsrj<dsbc> b = dssu.b;
    public dsef c;
    public drxj d;

    static {
        dryh dryhVar = new dryh();
        e = dryhVar;
        dsqw.cc(dryh.class, dryhVar);
    }

    private dryh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", dsbc.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dryh();
            }
            if (i2 == 4) {
                return new dryg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dryh.class) {
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
