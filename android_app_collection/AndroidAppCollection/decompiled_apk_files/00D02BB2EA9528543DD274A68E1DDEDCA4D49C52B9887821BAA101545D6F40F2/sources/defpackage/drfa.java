package defpackage;
/* compiled from: PG */
/* renamed from: drfa  reason: default package */
/* loaded from: classes6.dex */
public final class drfa extends dsqw<drfa, drez> implements dssk {
    public static final drfa c;
    private static volatile dssr<drfa> d;
    public int a = 0;
    public Object b;

    static {
        drfa drfaVar = new drfa();
        c = drfaVar;
        dsqw.cc(drfa.class, drfaVar);
    }

    private drfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new drfa();
            }
            if (i2 == 4) {
                return new drez();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drfa.class) {
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
