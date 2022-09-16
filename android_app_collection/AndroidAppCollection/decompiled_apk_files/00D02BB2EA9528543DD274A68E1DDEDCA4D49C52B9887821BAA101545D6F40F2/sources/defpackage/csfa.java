package defpackage;
/* compiled from: PG */
/* renamed from: csfa  reason: default package */
/* loaded from: classes5.dex */
public final class csfa extends dsqw<csfa, csez> implements dssk {
    public static final csfa a;
    private static volatile dssr<csfa> b;

    static {
        csfa csfaVar = new csfa();
        a = csfaVar;
        dsqw.cc(csfa.class, csfaVar);
    }

    private csfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new csfa();
            }
            if (i2 == 4) {
                return new csez();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csfa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (csfa.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
