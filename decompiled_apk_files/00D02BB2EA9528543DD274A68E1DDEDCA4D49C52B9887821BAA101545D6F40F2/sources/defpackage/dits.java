package defpackage;
/* compiled from: PG */
/* renamed from: dits  reason: default package */
/* loaded from: classes.dex */
public final class dits extends dsqw<dits, ditr> implements dssk {
    public static final dits f;
    private static volatile dssr<dits> g;
    public int a;
    public dpop b;
    public dpuo c;
    public int d;
    public int e;

    static {
        dits ditsVar = new dits();
        f = ditsVar;
        dsqw.cc(dits.class, ditsVar);
    }

    private dits() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dits();
            }
            if (i2 == 4) {
                return new ditr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dits> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dits.class) {
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
