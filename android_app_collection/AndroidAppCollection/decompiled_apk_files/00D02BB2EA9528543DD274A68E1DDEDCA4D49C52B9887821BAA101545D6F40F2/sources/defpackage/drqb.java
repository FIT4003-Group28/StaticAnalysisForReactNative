package defpackage;
/* compiled from: PG */
/* renamed from: drqb  reason: default package */
/* loaded from: classes6.dex */
public final class drqb extends dsqw<drqb, drpy> implements dssk {
    public static final drqb d;
    private static volatile dssr<drqb> e;
    public int a;
    public String b = "";
    public drqa c;

    static {
        drqb drqbVar = new drqb();
        d = drqbVar;
        dsqw.cc(drqb.class, drqbVar);
    }

    private drqb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drqb();
            }
            if (i2 == 4) {
                return new drpy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drqb.class) {
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
