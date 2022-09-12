package defpackage;
/* compiled from: PG */
/* renamed from: disi  reason: default package */
/* loaded from: classes6.dex */
public final class disi extends dsqw<disi, dish> implements dssk {
    public static final disi c;
    private static volatile dssr<disi> d;
    public int a = 0;
    public Object b;

    static {
        disi disiVar = new disi();
        c = disiVar;
        dsqw.cc(disi.class, disiVar);
    }

    private disi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new disi();
            }
            if (i2 == 4) {
                return new dish();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<disi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (disi.class) {
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
