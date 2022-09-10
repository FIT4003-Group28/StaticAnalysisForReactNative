package defpackage;
/* compiled from: PG */
/* renamed from: dojs  reason: default package */
/* loaded from: classes6.dex */
public final class dojs extends dsqw<dojs, dojq> implements dssk {
    public static final dojs d;
    private static volatile dssr<dojs> e;
    public int a;
    public int b;
    public drki c;

    static {
        dojs dojsVar = new dojs();
        d = dojsVar;
        dsqw.cc(dojs.class, dojsVar);
    }

    private dojs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dojr.a, "c"});
            }
            if (i2 == 3) {
                return new dojs();
            }
            if (i2 == 4) {
                return new dojq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dojs.class) {
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
