package defpackage;
/* compiled from: PG */
/* renamed from: doix  reason: default package */
/* loaded from: classes6.dex */
public final class doix extends dsqw<doix, doiw> implements dssk {
    public static final doix c;
    private static volatile dssr<doix> e;
    public int a;
    public drki b;
    private int d;

    static {
        doix doixVar = new doix();
        c = doixVar;
        dsqw.cc(doix.class, doixVar);
    }

    private doix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", doiu.a, "b"});
            }
            if (i2 == 3) {
                return new doix();
            }
            if (i2 == 4) {
                return new doiw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doix> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doix.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
