package defpackage;
/* compiled from: PG */
/* renamed from: dsjw  reason: default package */
/* loaded from: classes6.dex */
public final class dsjw extends dsqw<dsjw, dsjv> implements dssk {
    public static final dsjw d;
    private static volatile dssr<dsjw> e;
    public int a;
    public dskd b;
    public long c;

    static {
        dsjw dsjwVar = new dsjw();
        d = dsjwVar;
        dsqw.cc(dsjw.class, dsjwVar);
    }

    private dsjw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsjw();
            }
            if (i2 == 4) {
                return new dsjv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsjw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsjw.class) {
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
