package defpackage;
/* compiled from: PG */
/* renamed from: ddqb  reason: default package */
/* loaded from: classes6.dex */
public final class ddqb extends dsqw<ddqb, ddqa> implements dssk {
    public static final ddqb d;
    private static volatile dssr<ddqb> f;
    public int a;
    public int c;
    private byte e = 2;
    public dsrj<ddhk> b = dssu.b;

    static {
        ddqb ddqbVar = new ddqb();
        d = ddqbVar;
        dsqw.cc(ddqb.class, ddqbVar);
    }

    private ddqb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002င\u0000", new Object[]{"a", "b", ddhk.class, "c"});
            }
            if (i2 == 3) {
                return new ddqb();
            }
            if (i2 == 4) {
                return new ddqa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<ddqb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddqb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
