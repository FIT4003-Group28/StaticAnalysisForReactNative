package defpackage;
/* compiled from: PG */
/* renamed from: dswg  reason: default package */
/* loaded from: classes6.dex */
public final class dswg extends dsqw<dswg, dswf> implements dssk {
    public static final dswg e;
    private static volatile dssr<dswg> f;
    public int a;
    public String b = "";
    public long c;
    public long d;

    static {
        dswg dswgVar = new dswg();
        e = dswgVar;
        dsqw.cc(dswg.class, dswgVar);
    }

    private dswg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dswg();
            }
            if (i2 == 4) {
                return new dswf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dswg.class) {
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
