package defpackage;
/* compiled from: PG */
/* renamed from: dicy  reason: default package */
/* loaded from: classes6.dex */
public final class dicy extends dsqw<dicy, dicv> implements dssk {
    public static final dicy d;
    private static volatile dssr<dicy> g;
    public int a;
    public dnwb c;
    private dnqh e;
    private byte f = 2;
    public dsrj<dicx> b = dssu.b;

    static {
        dicy dicyVar = new dicy();
        d = dicyVar;
        dsqw.cc(dicy.class, dicyVar);
    }

    private dicy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u001b\u0002ဉ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", dicx.class, "c", "e"});
            }
            if (i2 == 3) {
                return new dicy();
            }
            if (i2 == 4) {
                return new dicv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dicy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dicy.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
