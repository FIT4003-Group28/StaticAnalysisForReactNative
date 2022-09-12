package defpackage;
/* compiled from: PG */
/* renamed from: dqqk  reason: default package */
/* loaded from: classes6.dex */
public final class dqqk extends dsqw<dqqk, dqqh> implements dssk {
    public static final dqqk b;
    private static volatile dssr<dqqk> c;
    public dsrj<dqqj> a = dssu.b;

    static {
        dqqk dqqkVar = new dqqk();
        b = dqqkVar;
        dsqw.cc(dqqk.class, dqqkVar);
    }

    private dqqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqqj.class});
            }
            if (i2 == 3) {
                return new dqqk();
            }
            if (i2 == 4) {
                return new dqqh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqqk.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
