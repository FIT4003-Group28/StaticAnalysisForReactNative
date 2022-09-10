package defpackage;
/* compiled from: PG */
/* renamed from: dkzo  reason: default package */
/* loaded from: classes6.dex */
public final class dkzo extends dsqw<dkzo, dkzm> implements dssk {
    public static final dkzo d;
    private static volatile dssr<dkzo> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dkzo dkzoVar = new dkzo();
        d = dkzoVar;
        dsqw.cc(dkzo.class, dkzoVar);
    }

    private dkzo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u0004ဌ\u0000", new Object[]{"a", "c", "b", dkzn.a});
            }
            if (i2 == 3) {
                return new dkzo();
            }
            if (i2 == 4) {
                return new dkzm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkzo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkzo.class) {
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
