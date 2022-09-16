package defpackage;
/* compiled from: PG */
/* renamed from: cpyx  reason: default package */
/* loaded from: classes5.dex */
public final class cpyx extends dsqw<cpyx, cpyw> implements dssk {
    public static final cpyx a;
    private static volatile dssr<cpyx> c;
    private byte b = 2;

    static {
        cpyx cpyxVar = new cpyx();
        a = cpyxVar;
        dsqw.cc(cpyx.class, cpyxVar);
    }

    private cpyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cpyx();
            }
            if (i2 == 4) {
                return new cpyw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<cpyx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cpyx.class) {
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
