package defpackage;
/* compiled from: PG */
/* renamed from: dglg  reason: default package */
/* loaded from: classes6.dex */
public final class dglg extends dsqw<dglg, dgld> implements dssk {
    public static final dglg c;
    private static volatile dssr<dglg> d;
    public int a = 0;
    public Object b;

    static {
        dglg dglgVar = new dglg();
        c = dglgVar;
        dsqw.cc(dglg.class, dglgVar);
    }

    private dglg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000", new Object[]{"b", "a", dgle.a});
            }
            if (i2 == 3) {
                return new dglg();
            }
            if (i2 == 4) {
                return new dgld();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dglg.class) {
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
