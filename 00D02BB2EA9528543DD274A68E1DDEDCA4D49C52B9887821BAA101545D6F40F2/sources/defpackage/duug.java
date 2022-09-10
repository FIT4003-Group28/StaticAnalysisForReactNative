package defpackage;
/* compiled from: PG */
/* renamed from: duug  reason: default package */
/* loaded from: classes.dex */
public final class duug extends dsqw<duug, duuf> implements dssk {
    public static final duug a;
    private static volatile dssr<duug> b;

    static {
        duug duugVar = new duug();
        a = duugVar;
        dsqw.cc(duug.class, duugVar);
    }

    private duug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new duug();
            }
            if (i2 == 4) {
                return new duuf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duug> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duug.class) {
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
