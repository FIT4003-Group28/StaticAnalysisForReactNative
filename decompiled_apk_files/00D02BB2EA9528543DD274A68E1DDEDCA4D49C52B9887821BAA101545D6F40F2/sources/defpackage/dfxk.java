package defpackage;
/* compiled from: PG */
/* renamed from: dfxk  reason: default package */
/* loaded from: classes6.dex */
public final class dfxk extends dsqw<dfxk, dfxj> implements dssk {
    public static final dfxk a;
    private static volatile dssr<dfxk> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dfxk dfxkVar = new dfxk();
        a = dfxkVar;
        dsqw.cc(dfxk.class, dfxkVar);
    }

    private dfxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dfxk();
            }
            if (i2 == 4) {
                return new dfxj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dfxk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfxk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
