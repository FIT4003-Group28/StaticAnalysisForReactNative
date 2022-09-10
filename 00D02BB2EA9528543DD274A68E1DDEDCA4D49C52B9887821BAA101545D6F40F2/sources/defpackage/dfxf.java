package defpackage;
/* compiled from: PG */
/* renamed from: dfxf  reason: default package */
/* loaded from: classes6.dex */
public final class dfxf extends dsqw<dfxf, dfxe> implements dssk {
    public static final dfxf g;
    private static volatile dssr<dfxf> i;
    public int a;
    public dfxi b;
    public dfxb c;
    public dfyk d;
    public dfxo e;
    public dsrj<dfya> f;
    private byte h = 2;

    static {
        dfxf dfxfVar = new dfxf();
        g = dfxfVar;
        dsqw.cc(dfxf.class, dfxfVar);
    }

    private dfxf() {
        dssu<Object> dssuVar = dssu.b;
        this.f = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0006ဉ\u0004\rЛ", new Object[]{"a", "b", "c", "d", "e", "f", dfya.class});
            }
            if (i3 == 3) {
                return new dfxf();
            }
            if (i3 == 4) {
                return new dfxe();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dfxf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dfxf.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
