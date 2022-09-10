package defpackage;
/* compiled from: PG */
/* renamed from: dute  reason: default package */
/* loaded from: classes6.dex */
public final class dute extends dsqw<dute, dutd> implements dssk {
    public static final dute a;
    private static volatile dssr<dute> c;
    private byte b = 2;

    static {
        dute duteVar = new dute();
        a = duteVar;
        dsqw.cc(dute.class, duteVar);
    }

    private dute() {
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
                return new dute();
            }
            if (i2 == 4) {
                return new dutd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dute> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dute.class) {
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
