package defpackage;
/* compiled from: PG */
/* renamed from: doof  reason: default package */
/* loaded from: classes6.dex */
public final class doof extends dsqw<doof, dooe> implements dssk {
    public static final doof e;
    private static volatile dssr<doof> f;
    public int a;
    public dgaw b;
    public dgaw c;
    public dgas d;

    static {
        doof doofVar = new doof();
        e = doofVar;
        dsqw.cc(doof.class, doofVar);
    }

    private doof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new doof();
            }
            if (i2 == 4) {
                return new dooe();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doof> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doof.class) {
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
