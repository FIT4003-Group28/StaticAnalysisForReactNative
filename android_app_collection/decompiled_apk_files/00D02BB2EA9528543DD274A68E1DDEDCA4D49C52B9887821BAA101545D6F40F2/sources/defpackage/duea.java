package defpackage;
/* compiled from: PG */
/* renamed from: duea  reason: default package */
/* loaded from: classes6.dex */
public final class duea extends dsqw<duea, dudz> implements dssk {
    public static final duea a;
    private static volatile dssr<duea> b;

    static {
        duea dueaVar = new duea();
        a = dueaVar;
        dsqw.cc(duea.class, dueaVar);
    }

    private duea() {
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
                return new duea();
            }
            if (i2 == 4) {
                return new dudz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duea> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duea.class) {
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
