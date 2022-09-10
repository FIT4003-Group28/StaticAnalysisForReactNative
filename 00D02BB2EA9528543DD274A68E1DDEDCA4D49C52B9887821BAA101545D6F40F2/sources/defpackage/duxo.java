package defpackage;
/* compiled from: PG */
/* renamed from: duxo  reason: default package */
/* loaded from: classes.dex */
public final class duxo extends dsqw<duxo, duxn> implements dssk {
    public static final duxo e;
    private static volatile dssr<duxo> g;
    public dsrf a = dsqz.b;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        duxo duxoVar = new duxo();
        e = duxoVar;
        dsqw.cc(duxo.class, duxoVar);
    }

    private duxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u0016\u0002ဇ\u0000\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duxo();
            }
            if (i2 == 4) {
                return new duxn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duxo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
