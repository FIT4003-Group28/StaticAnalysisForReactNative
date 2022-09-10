package defpackage;
/* compiled from: PG */
/* renamed from: dklb  reason: default package */
/* loaded from: classes6.dex */
public final class dklb extends dsqw<dklb, dkky> implements dssk {
    public static final dklb c;
    private static volatile dssr<dklb> e;
    public int a;
    public dsrf b = dsqz.b;
    private dkla d;

    static {
        dklb dklbVar = new dklb();
        c = dklbVar;
        dsqw.cc(dklb.class, dklbVar);
    }

    private dklb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ဉ\u0000", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dklb();
            }
            if (i2 == 4) {
                return new dkky();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dklb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dklb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
