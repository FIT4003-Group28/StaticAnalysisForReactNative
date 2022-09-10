package defpackage;
/* compiled from: PG */
/* renamed from: drtj  reason: default package */
/* loaded from: classes6.dex */
public final class drtj extends dsqw<drtj, drti> implements dssk {
    public static final drtj a;
    private static volatile dssr<drtj> c;
    private byte b = 2;

    static {
        drtj drtjVar = new drtj();
        a = drtjVar;
        dsqw.cc(drtj.class, drtjVar);
    }

    private drtj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drtj();
            }
            if (i2 == 4) {
                return new drti();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<drtj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drtj.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
