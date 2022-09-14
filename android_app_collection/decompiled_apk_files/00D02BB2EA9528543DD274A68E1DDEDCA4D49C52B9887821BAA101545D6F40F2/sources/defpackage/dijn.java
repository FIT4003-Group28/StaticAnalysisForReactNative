package defpackage;
/* compiled from: PG */
/* renamed from: dijn  reason: default package */
/* loaded from: classes6.dex */
public final class dijn extends dsqw<dijn, dijl> implements dssk {
    public static final dijn e;
    private static volatile dssr<dijn> f;
    public int a;
    public int c;
    public String b = "";
    public dsrj<djjj> d = dssu.b;

    static {
        dijn dijnVar = new dijn();
        e = dijnVar;
        dsqw.cc(dijn.class, dijnVar);
    }

    private dijn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", "c", dijm.a, "d", djjj.class});
            }
            if (i2 == 3) {
                return new dijn();
            }
            if (i2 == 4) {
                return new dijl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dijn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dijn.class) {
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
