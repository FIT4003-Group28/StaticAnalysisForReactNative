package defpackage;
/* compiled from: PG */
/* renamed from: dokw  reason: default package */
/* loaded from: classes6.dex */
public final class dokw extends dsqw<dokw, dokv> implements dssk {
    public static final dokw a;
    private static volatile dssr<dokw> c;
    private byte b = 2;

    static {
        dokw dokwVar = new dokw();
        a = dokwVar;
        dsqw.cc(dokw.class, dokwVar);
    }

    private dokw() {
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
                return new dokw();
            }
            if (i2 == 4) {
                return new dokv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dokw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dokw.class) {
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
