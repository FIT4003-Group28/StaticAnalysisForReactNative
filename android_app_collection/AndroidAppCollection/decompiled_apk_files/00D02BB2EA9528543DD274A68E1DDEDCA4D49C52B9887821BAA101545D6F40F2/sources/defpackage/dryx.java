package defpackage;
/* compiled from: PG */
/* renamed from: dryx  reason: default package */
/* loaded from: classes6.dex */
public final class dryx extends dsqw<dryx, dryw> implements dssk {
    public static final dryx d;
    private static volatile dssr<dryx> f;
    public dsrj<dscr> a = dssu.b;
    public long b;
    public long c;
    private int e;

    static {
        dryx dryxVar = new dryx();
        d = dryxVar;
        dsqw.cc(dryx.class, dryxVar);
    }

    private dryx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004ဂ\u0000\u0005ဂ\u0001\u0007\u001b", new Object[]{"e", "b", "c", "a", dscr.class});
            }
            if (i2 == 3) {
                return new dryx();
            }
            if (i2 == 4) {
                return new dryw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dryx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
