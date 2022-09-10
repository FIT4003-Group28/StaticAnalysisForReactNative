package defpackage;
/* compiled from: PG */
/* renamed from: dinb  reason: default package */
/* loaded from: classes6.dex */
public final class dinb extends dsqw<dinb, dina> implements dssk {
    public static final dinb c;
    private static volatile dssr<dinb> d;
    public int a;
    public drdk b;

    static {
        dinb dinbVar = new dinb();
        c = dinbVar;
        dsqw.cc(dinb.class, dinbVar);
    }

    private dinb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dinb();
            }
            if (i2 == 4) {
                return new dina();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dinb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dinb.class) {
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
