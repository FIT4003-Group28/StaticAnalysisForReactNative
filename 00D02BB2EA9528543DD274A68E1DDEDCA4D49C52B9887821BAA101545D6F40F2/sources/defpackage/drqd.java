package defpackage;
/* compiled from: PG */
/* renamed from: drqd  reason: default package */
/* loaded from: classes6.dex */
public final class drqd extends dsqw<drqd, drqc> implements dssk {
    public static final drqd c;
    private static volatile dssr<drqd> d;
    public int a;
    public String b = "";

    static {
        drqd drqdVar = new drqd();
        c = drqdVar;
        dsqw.cc(drqd.class, drqdVar);
    }

    private drqd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drqd();
            }
            if (i2 == 4) {
                return new drqc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drqd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
