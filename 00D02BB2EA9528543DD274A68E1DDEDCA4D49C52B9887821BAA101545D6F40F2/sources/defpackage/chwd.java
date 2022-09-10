package defpackage;
/* compiled from: PG */
/* renamed from: chwd  reason: default package */
/* loaded from: classes4.dex */
public final class chwd extends dsqw<chwd, chwc> implements dssk {
    public static final chwd a;
    private static volatile dssr<chwd> b;

    static {
        chwd chwdVar = new chwd();
        a = chwdVar;
        dsqw.cc(chwd.class, chwdVar);
    }

    private chwd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new chwd();
            }
            if (i2 == 4) {
                return new chwc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (chwd.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
