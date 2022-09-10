package defpackage;
/* compiled from: PG */
/* renamed from: dolo  reason: default package */
/* loaded from: classes6.dex */
public final class dolo extends dsqw<dolo, doln> implements dssk {
    public static final dolo d;
    private static volatile dssr<dolo> e;
    public int a;
    public dpot b;
    public dojz c;

    static {
        dolo doloVar = new dolo();
        d = doloVar;
        dsqw.cc(dolo.class, doloVar);
    }

    private dolo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dolo();
            }
            if (i2 == 4) {
                return new doln();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dolo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dolo.class) {
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
