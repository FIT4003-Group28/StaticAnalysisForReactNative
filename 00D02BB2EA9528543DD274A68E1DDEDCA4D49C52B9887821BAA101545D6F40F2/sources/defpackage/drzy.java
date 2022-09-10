package defpackage;
/* compiled from: PG */
/* renamed from: drzy  reason: default package */
/* loaded from: classes6.dex */
public final class drzy extends dsqw<drzy, drzx> implements dssk {
    public static final drzy d;
    private static volatile dssr<drzy> e;
    public int a;
    public String b = "";
    public dsef c;

    static {
        drzy drzyVar = new drzy();
        d = drzyVar;
        dsqw.cc(drzy.class, drzyVar);
    }

    private drzy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drzy();
            }
            if (i2 == 4) {
                return new drzx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drzy.class) {
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
