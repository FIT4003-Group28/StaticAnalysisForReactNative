package defpackage;
/* compiled from: PG */
/* renamed from: dwof  reason: default package */
/* loaded from: classes6.dex */
public final class dwof extends dsqw<dwof, dwoe> implements dssk {
    public static final dwof a;
    private static volatile dssr<dwof> c;
    private byte b = 2;

    static {
        dwof dwofVar = new dwof();
        a = dwofVar;
        dsqw.cc(dwof.class, dwofVar);
    }

    private dwof() {
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
                return new dwof();
            }
            if (i2 == 4) {
                return new dwoe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dwof> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwof.class) {
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
