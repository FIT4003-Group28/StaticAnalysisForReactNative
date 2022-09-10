package defpackage;
/* compiled from: PG */
/* renamed from: drqa  reason: default package */
/* loaded from: classes6.dex */
public final class drqa extends dsqw<drqa, drpz> implements dssk {
    public static final drqa d;
    private static volatile dssr<drqa> e;
    public int a;
    public long b;
    public int c;

    static {
        drqa drqaVar = new drqa();
        d = drqaVar;
        dsqw.cc(drqa.class, drqaVar);
    }

    private drqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drqa();
            }
            if (i2 == 4) {
                return new drpz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drqa.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
