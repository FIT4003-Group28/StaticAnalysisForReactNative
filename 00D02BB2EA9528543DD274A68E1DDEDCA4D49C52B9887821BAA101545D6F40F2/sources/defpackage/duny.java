package defpackage;
/* compiled from: PG */
/* renamed from: duny  reason: default package */
/* loaded from: classes.dex */
public final class duny extends dsqw<duny, dunx> implements dssk {
    public static final duny a;
    private static volatile dssr<duny> c;
    private byte b = 2;

    static {
        duny dunyVar = new duny();
        a = dunyVar;
        dsqw.cc(duny.class, dunyVar);
    }

    private duny() {
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
                return new duny();
            }
            if (i2 == 4) {
                return new dunx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<duny> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duny.class) {
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
