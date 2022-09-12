package defpackage;
/* compiled from: PG */
/* renamed from: dgiy  reason: default package */
/* loaded from: classes6.dex */
public final class dgiy extends dsqw<dgiy, dgix> implements dssk {
    public static final dgiy h;
    private static volatile dssr<dgiy> i;
    public int a;
    public String b = "";
    public dgiu c;
    public dggq d;
    public dgis e;
    public dgji f;
    public int g;

    static {
        dgiy dgiyVar = new dgiy();
        h = dgiyVar;
        dsqw.cc(dgiy.class, dgiyVar);
    }

    private dgiy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0006ဉ\u0007\u0007ဌ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", dgiv.a});
            }
            if (i3 == 3) {
                return new dgiy();
            }
            if (i3 == 4) {
                return new dgix();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgiy> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dgiy.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
