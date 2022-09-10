package defpackage;
/* compiled from: PG */
/* renamed from: dgrj  reason: default package */
/* loaded from: classes6.dex */
public final class dgrj extends dsqw<dgrj, dgri> implements dssk {
    public static final dgrj a;
    private static volatile dssr<dgrj> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dgrj dgrjVar = new dgrj();
        a = dgrjVar;
        dsqw.cc(dgrj.class, dgrjVar);
    }

    private dgrj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgrj();
            }
            if (i2 == 4) {
                return new dgri();
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
            dssr<dgrj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgrj.class) {
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
