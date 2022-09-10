package defpackage;
/* compiled from: PG */
/* renamed from: dndl  reason: default package */
/* loaded from: classes.dex */
public final class dndl extends dsqw<dndl, dndk> implements dssk {
    public static final dndl d;
    private static volatile dssr<dndl> e;
    public int a;
    public int b = -1;
    public String c = "";

    static {
        dndl dndlVar = new dndl();
        d = dndlVar;
        dsqw.cc(dndl.class, dndlVar);
    }

    private dndl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", dndr.c(), "c"});
            }
            if (i2 == 3) {
                return new dndl();
            }
            if (i2 == 4) {
                return new dndk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dndl.class) {
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
