package defpackage;
/* compiled from: PG */
/* renamed from: dusy  reason: default package */
/* loaded from: classes6.dex */
public final class dusy extends dsqw<dusy, dusx> implements dssk {
    public static final dusy a;
    private static volatile dssr<dusy> b;

    static {
        dusy dusyVar = new dusy();
        a = dusyVar;
        dsqw.cc(dusy.class, dusyVar);
    }

    private dusy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dusy();
            }
            if (i2 == 4) {
                return new dusx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dusy.class) {
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
