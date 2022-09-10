package defpackage;
/* compiled from: PG */
/* renamed from: cspa  reason: default package */
/* loaded from: classes5.dex */
public final class cspa extends dsqw<cspa, csoz> implements dssk {
    public static final cspa e;
    private static volatile dssr<cspa> f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        cspa cspaVar = new cspa();
        e = cspaVar;
        dsqw.cc(cspa.class, cspaVar);
    }

    private cspa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cspa();
            }
            if (i2 == 4) {
                return new csoz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cspa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cspa.class) {
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
