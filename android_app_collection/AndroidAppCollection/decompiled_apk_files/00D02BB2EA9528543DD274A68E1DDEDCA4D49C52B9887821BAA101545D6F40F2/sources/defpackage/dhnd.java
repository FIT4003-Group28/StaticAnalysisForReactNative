package defpackage;
/* compiled from: PG */
/* renamed from: dhnd  reason: default package */
/* loaded from: classes6.dex */
public final class dhnd extends dsqw<dhnd, dhna> implements dssk {
    public static final dhnd i;
    private static volatile dssr<dhnd> j;
    public int a;
    public float f;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public dsrj<dhnc> g = dssu.b;
    public dsrj<djia> h = dssu.b;

    static {
        dhnd dhndVar = new dhnd();
        i = dhndVar;
        dsqw.cc(dhnd.class, dhndVar);
    }

    private dhnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0004ခ\u0004\u0005\u001b\u0006\u001b\u0007ဈ\u0000", new Object[]{"a", "c", "d", "e", "f", "g", dhnc.class, "h", djia.class, "b"});
            }
            if (i3 == 3) {
                return new dhnd();
            }
            if (i3 == 4) {
                return new dhna();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dhnd> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhnd.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
