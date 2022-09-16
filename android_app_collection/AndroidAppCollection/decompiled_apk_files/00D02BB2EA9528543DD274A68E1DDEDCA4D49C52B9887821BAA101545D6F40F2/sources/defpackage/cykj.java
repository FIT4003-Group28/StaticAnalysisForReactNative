package defpackage;
/* compiled from: PG */
/* renamed from: cykj  reason: default package */
/* loaded from: classes5.dex */
public final class cykj extends dsqw<cykj, cyki> implements dssk {
    public static final cykj d;
    private static volatile dssr<cykj> e;
    public int a;
    public String b = "";
    public cyjt c;

    static {
        cykj cykjVar = new cykj();
        d = cykjVar;
        dsqw.cc(cykj.class, cykjVar);
    }

    private cykj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cykj();
            }
            if (i2 == 4) {
                return new cyki();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cykj.class) {
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
