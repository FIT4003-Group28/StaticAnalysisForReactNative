package defpackage;
/* compiled from: PG */
/* renamed from: dtzl  reason: default package */
/* loaded from: classes6.dex */
public final class dtzl extends dsqw<dtzl, dtzh> implements dssk {
    public static final dtzl d;
    private static volatile dssr<dtzl> e;
    public dtzg a;
    public dtzk b;
    public dspt c;

    static {
        dtzl dtzlVar = new dtzl();
        d = dtzlVar;
        dsqw.cc(dtzl.class, dtzlVar);
    }

    private dtzl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtzl();
            }
            if (i2 == 4) {
                return new dtzh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtzl.class) {
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
