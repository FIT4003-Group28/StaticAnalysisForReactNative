package defpackage;
/* compiled from: PG */
/* renamed from: dphb  reason: default package */
/* loaded from: classes6.dex */
public final class dphb extends dsqw<dphb, dpha> implements dssk {
    public static final dphb c;
    private static volatile dssr<dphb> d;
    public int a;
    public int b;

    static {
        dphb dphbVar = new dphb();
        c = dphbVar;
        dsqw.cc(dphb.class, dphbVar);
    }

    private dphb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dphb();
            }
            if (i2 == 4) {
                return new dpha();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dphb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dphb.class) {
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
