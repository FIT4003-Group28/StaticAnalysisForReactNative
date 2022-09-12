package defpackage;
/* compiled from: PG */
/* renamed from: dqgw  reason: default package */
/* loaded from: classes6.dex */
public final class dqgw extends dsqw<dqgw, dqgv> implements dssk {
    public static final dqgw d;
    private static volatile dssr<dqgw> f;
    public int a;
    public int b;
    public dpxb c;
    private byte e = 2;

    static {
        dqgw dqgwVar = new dqgw();
        d = dqgwVar;
        dsqw.cc(dqgw.class, dqgwVar);
    }

    private dqgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqgw();
            }
            if (i2 == 4) {
                return new dqgv();
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
            dssr<dqgw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqgw.class) {
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
