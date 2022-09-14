package defpackage;
/* compiled from: PG */
/* renamed from: dvfa  reason: default package */
/* loaded from: classes.dex */
public final class dvfa extends dsqw<dvfa, dvez> implements dssk {
    public static final dvfa a;
    private static volatile dssr<dvfa> b;

    static {
        dvfa dvfaVar = new dvfa();
        a = dvfaVar;
        dsqw.cc(dvfa.class, dvfaVar);
    }

    private dvfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvfa();
            }
            if (i2 == 4) {
                return new dvez();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvfa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvfa.class) {
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
