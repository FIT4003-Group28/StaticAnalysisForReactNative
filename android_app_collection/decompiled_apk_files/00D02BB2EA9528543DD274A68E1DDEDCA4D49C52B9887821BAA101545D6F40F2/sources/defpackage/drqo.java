package defpackage;
/* compiled from: PG */
/* renamed from: drqo  reason: default package */
/* loaded from: classes6.dex */
public final class drqo extends dsqw<drqo, drqn> implements dssk {
    public static final drqo a;
    private static volatile dssr<drqo> b;

    static {
        drqo drqoVar = new drqo();
        a = drqoVar;
        dsqw.cc(drqo.class, drqoVar);
    }

    private drqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqo();
            }
            if (i2 == 4) {
                return new drqn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqo.class) {
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
