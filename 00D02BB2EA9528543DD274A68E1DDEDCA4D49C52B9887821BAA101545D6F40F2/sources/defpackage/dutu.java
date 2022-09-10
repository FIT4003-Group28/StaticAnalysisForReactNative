package defpackage;
/* compiled from: PG */
/* renamed from: dutu  reason: default package */
/* loaded from: classes6.dex */
public final class dutu extends dsqw<dutu, dutt> implements dssk {
    public static final dutu a;
    private static volatile dssr<dutu> b;

    static {
        dutu dutuVar = new dutu();
        a = dutuVar;
        dsqw.cc(dutu.class, dutuVar);
    }

    private dutu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dutu();
            }
            if (i2 == 4) {
                return new dutt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dutu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dutu.class) {
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
