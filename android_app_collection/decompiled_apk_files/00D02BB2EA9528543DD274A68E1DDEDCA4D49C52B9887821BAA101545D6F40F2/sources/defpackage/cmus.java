package defpackage;
/* compiled from: PG */
/* renamed from: cmus  reason: default package */
/* loaded from: classes5.dex */
public final class cmus extends dsqw<cmus, cmup> implements dssk {
    public static final cmus c;
    private static volatile dssr<cmus> e;
    public int a;
    public String b = "";
    private int d;

    static {
        cmus cmusVar = new cmus();
        c = cmusVar;
        dsqw.cc(cmus.class, cmusVar);
    }

    private cmus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", cmuq.a, "b"});
            }
            if (i2 == 3) {
                return new cmus();
            }
            if (i2 == 4) {
                return new cmup();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cmus> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cmus.class) {
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
