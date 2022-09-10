package defpackage;
/* compiled from: PG */
/* renamed from: cpzu  reason: default package */
/* loaded from: classes5.dex */
public final class cpzu extends dsqw<cpzu, cpzt> implements dssk {
    public static final cpzu b;
    private static volatile dssr<cpzu> c;
    public dsrj<String> a = dssu.b;

    static {
        cpzu cpzuVar = new cpzu();
        b = cpzuVar;
        dsqw.cc(cpzu.class, cpzuVar);
    }

    private cpzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cpzu();
            }
            if (i2 == 4) {
                return new cpzt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpzu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cpzu.class) {
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
