package defpackage;
/* compiled from: PG */
/* renamed from: btyo  reason: default package */
/* loaded from: classes.dex */
public final class btyo extends dsqw<btyo, btyl> implements dssk {
    public static final btyo e;
    private static volatile dssr<btyo> f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    static {
        btyo btyoVar = new btyo();
        e = btyoVar;
        dsqw.cc(btyo.class, btyoVar);
    }

    private btyo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", btym.a, "d"});
            }
            if (i2 == 3) {
                return new btyo();
            }
            if (i2 == 4) {
                return new btyl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<btyo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (btyo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
