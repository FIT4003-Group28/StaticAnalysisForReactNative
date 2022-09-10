package defpackage;
/* compiled from: PG */
/* renamed from: doid  reason: default package */
/* loaded from: classes6.dex */
public final class doid extends dsqw<doid, doic> implements dssk {
    public static final doid c;
    private static volatile dssr<doid> e;
    public int a;
    public drjs b;
    private int d;

    static {
        doid doidVar = new doid();
        c = doidVar;
        dsqw.cc(doid.class, doidVar);
    }

    private doid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", doia.a, "b"});
            }
            if (i2 == 3) {
                return new doid();
            }
            if (i2 == 4) {
                return new doic();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doid> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doid.class) {
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
