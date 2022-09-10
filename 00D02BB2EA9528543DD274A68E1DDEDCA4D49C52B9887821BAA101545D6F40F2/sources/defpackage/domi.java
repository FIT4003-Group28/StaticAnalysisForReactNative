package defpackage;
/* compiled from: PG */
/* renamed from: domi  reason: default package */
/* loaded from: classes6.dex */
public final class domi extends dsqw<domi, domg> implements dssk {
    public static final domi d;
    private static volatile dssr<domi> e;
    public int a;
    public int b;
    public domd c;

    static {
        domi domiVar = new domi();
        d = domiVar;
        dsqw.cc(domi.class, domiVar);
    }

    private domi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", domh.a, "c"});
            }
            if (i2 == 3) {
                return new domi();
            }
            if (i2 == 4) {
                return new domg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (domi.class) {
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
