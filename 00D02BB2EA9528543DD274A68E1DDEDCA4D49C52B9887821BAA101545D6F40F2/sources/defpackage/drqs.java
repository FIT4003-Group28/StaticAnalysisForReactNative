package defpackage;
/* compiled from: PG */
/* renamed from: drqs  reason: default package */
/* loaded from: classes6.dex */
public final class drqs extends dsqw<drqs, drqr> implements dssk {
    public static final drqs a;
    private static volatile dssr<drqs> b;

    static {
        drqs drqsVar = new drqs();
        a = drqsVar;
        dsqw.cc(drqs.class, drqsVar);
    }

    private drqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqs();
            }
            if (i2 == 4) {
                return new drqr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqs.class) {
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
