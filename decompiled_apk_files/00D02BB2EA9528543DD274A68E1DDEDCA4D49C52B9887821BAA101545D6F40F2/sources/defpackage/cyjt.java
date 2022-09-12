package defpackage;
/* compiled from: PG */
/* renamed from: cyjt  reason: default package */
/* loaded from: classes5.dex */
public final class cyjt extends dsqw<cyjt, cyjq> implements dssk {
    public static final cyjt g;
    private static volatile dssr<cyjt> h;
    public int a;
    public boolean c;
    public boolean d;
    public String b = "";
    public dsrj<cyjs> e = dssu.b;
    public dsrj<cyil> f = dssu.b;

    static {
        cyjt cyjtVar = new cyjt();
        g = cyjtVar;
        dsqw.cc(cyjt.class, cyjtVar);
    }

    private cyjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0003\u0007\u0004\u0007\u0005\u001b\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", cyjs.class, "f", cyil.class});
            }
            if (i2 == 3) {
                return new cyjt();
            }
            if (i2 == 4) {
                return new cyjq();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjt> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cyjt.class) {
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
