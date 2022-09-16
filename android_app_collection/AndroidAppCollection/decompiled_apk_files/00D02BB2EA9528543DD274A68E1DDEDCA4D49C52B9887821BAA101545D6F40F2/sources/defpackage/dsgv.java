package defpackage;
/* compiled from: PG */
/* renamed from: dsgv  reason: default package */
/* loaded from: classes6.dex */
public final class dsgv extends dsqw<dsgv, dsgu> implements dssk {
    public static final dsgv f;
    private static volatile dssr<dsgv> g;
    public int a;
    public dsig b;
    public dshv c;
    public dsgd d;
    public boolean e;

    static {
        dsgv dsgvVar = new dsgv();
        f = dsgvVar;
        dsqw.cc(dsgv.class, dsgvVar);
    }

    private dsgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dsgv();
            }
            if (i2 == 4) {
                return new dsgu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsgv.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
