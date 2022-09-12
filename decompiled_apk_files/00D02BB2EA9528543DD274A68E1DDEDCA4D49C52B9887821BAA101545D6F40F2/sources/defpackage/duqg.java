package defpackage;
/* compiled from: PG */
/* renamed from: duqg  reason: default package */
/* loaded from: classes6.dex */
public final class duqg extends dsqw<duqg, duqf> implements dssk {
    public static final duqg e;
    private static volatile dssr<duqg> f;
    public int a;
    public int b;
    public dwao c;
    public dsrf d = dsqz.b;

    static {
        duqg duqgVar = new duqg();
        e = duqgVar;
        dsqw.cc(duqg.class, duqgVar);
    }

    private duqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004\u001e", new Object[]{"a", "b", dqvj.d(), "c", "d", duqi.c()});
            }
            if (i2 == 3) {
                return new duqg();
            }
            if (i2 == 4) {
                return new duqf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duqg.class) {
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
