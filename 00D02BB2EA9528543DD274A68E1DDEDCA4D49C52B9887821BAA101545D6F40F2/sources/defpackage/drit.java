package defpackage;
/* compiled from: PG */
/* renamed from: drit  reason: default package */
/* loaded from: classes6.dex */
public final class drit extends dsqw<drit, dris> implements dssk {
    public static final drit f;
    private static volatile dssr<drit> h;
    public String a = "";
    public dqfu b;
    public dqfu c;
    public drdg d;
    public drjn e;
    private int g;

    static {
        drit dritVar = new drit();
        f = dritVar;
        dsqw.cc(drit.class, dritVar);
    }

    private drit() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\bဉ\u0006", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new drit();
            }
            if (i2 == 4) {
                return new dris();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drit> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drit.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
