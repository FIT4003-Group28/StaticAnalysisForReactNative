package defpackage;
/* compiled from: PG */
/* renamed from: aola  reason: default package */
/* loaded from: classes2.dex */
public final class aola extends dsqw<aola, aokx> implements dssk {
    public static final aola f;
    private static volatile dssr<aola> g;
    public int a;
    public long b;
    public String c = "";
    public int d;
    public int e;

    static {
        aola aolaVar = new aola();
        f = aolaVar;
        dsqw.cc(aola.class, aolaVar);
    }

    private aola() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0002\u0006ဌ\u0005\bဌ\u0007", new Object[]{"a", "b", "c", "d", aoky.a, "e", dddn.c()});
            }
            if (i2 == 3) {
                return new aola();
            }
            if (i2 == 4) {
                return new aokx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aola> dssrVar = g;
            if (dssrVar == null) {
                synchronized (aola.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
