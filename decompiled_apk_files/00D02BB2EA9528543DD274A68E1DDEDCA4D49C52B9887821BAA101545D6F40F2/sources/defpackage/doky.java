package defpackage;
/* compiled from: PG */
/* renamed from: doky  reason: default package */
/* loaded from: classes6.dex */
public final class doky extends dsqw<doky, dokx> implements dssk {
    public static final doky a;
    private static volatile dssr<doky> e;
    private int b;
    private doku c;
    private byte d = 2;

    static {
        doky dokyVar = new doky();
        a = dokyVar;
        dsqw.cc(doky.class, dokyVar);
    }

    private doky() {
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
                return new doky();
            }
            if (i2 == 4) {
                return new dokx();
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
            dssr<doky> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doky.class) {
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
