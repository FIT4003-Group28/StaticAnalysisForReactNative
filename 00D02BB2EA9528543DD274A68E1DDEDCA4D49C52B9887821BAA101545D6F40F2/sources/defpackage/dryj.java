package defpackage;
/* compiled from: PG */
/* renamed from: dryj  reason: default package */
/* loaded from: classes6.dex */
public final class dryj extends dsqw<dryj, dryi> implements dssk {
    public static final dryj d;
    private static volatile dssr<dryj> e;
    public int a;
    public String b = "";
    public dsrj<dryh> c = dssu.b;

    static {
        dryj dryjVar = new dryj();
        d = dryjVar;
        dsqw.cc(dryj.class, dryjVar);
    }

    private dryj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dryh.class});
            }
            if (i2 == 3) {
                return new dryj();
            }
            if (i2 == 4) {
                return new dryi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dryj.class) {
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
