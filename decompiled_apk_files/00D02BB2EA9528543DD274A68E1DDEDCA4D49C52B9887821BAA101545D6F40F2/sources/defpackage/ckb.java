package defpackage;
/* compiled from: PG */
/* renamed from: ckb  reason: default package */
/* loaded from: classes4.dex */
public final class ckb extends dsqw<ckb, cka> implements dssk {
    public static final ckb c;
    private static volatile dssr<ckb> d;
    public int a;
    public int b;

    static {
        ckb ckbVar = new ckb();
        c = ckbVar;
        dsqw.cc(ckb.class, ckbVar);
    }

    private ckb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckb();
            }
            if (i2 == 4) {
                return new cka();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckb.class) {
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
