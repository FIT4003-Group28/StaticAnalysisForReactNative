package defpackage;
/* compiled from: PG */
/* renamed from: drqk  reason: default package */
/* loaded from: classes6.dex */
public final class drqk extends dsqw<drqk, drqj> implements dssk {
    public static final drqk a;
    private static volatile dssr<drqk> b;

    static {
        drqk drqkVar = new drqk();
        a = drqkVar;
        dsqw.cc(drqk.class, drqkVar);
    }

    private drqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqk();
            }
            if (i2 == 4) {
                return new drqj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqk.class) {
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
