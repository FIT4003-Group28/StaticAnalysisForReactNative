package defpackage;
/* compiled from: PG */
/* renamed from: drzs  reason: default package */
/* loaded from: classes6.dex */
public final class drzs extends dsqw<drzs, drzr> implements dssk {
    public static final drzs a;
    private static volatile dssr<drzs> b;

    static {
        drzs drzsVar = new drzs();
        a = drzsVar;
        dsqw.cc(drzs.class, drzsVar);
    }

    private drzs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drzs();
            }
            if (i2 == 4) {
                return new drzr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drzs.class) {
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
