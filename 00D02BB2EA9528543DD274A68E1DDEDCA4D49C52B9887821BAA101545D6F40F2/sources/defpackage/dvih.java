package defpackage;
/* compiled from: PG */
/* renamed from: dvih  reason: default package */
/* loaded from: classes.dex */
public final class dvih extends dsqw<dvih, dvig> implements dssk {
    public static final dvih d;
    private static volatile dssr<dvih> e;
    public int a;
    public dsrj<dpwv> b = dssu.b;
    public int c = 1;

    static {
        dvih dvihVar = new dvih();
        d = dvihVar;
        dsqw.cc(dvih.class, dvihVar);
    }

    private dvih() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", dpwv.class, "c"});
            }
            if (i2 == 3) {
                return new dvih();
            }
            if (i2 == 4) {
                return new dvig();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvih> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvih.class) {
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
