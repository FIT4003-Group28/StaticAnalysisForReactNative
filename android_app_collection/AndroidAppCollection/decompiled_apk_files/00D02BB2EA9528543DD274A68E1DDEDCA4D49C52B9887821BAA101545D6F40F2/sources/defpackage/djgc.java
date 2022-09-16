package defpackage;
/* compiled from: PG */
/* renamed from: djgc  reason: default package */
/* loaded from: classes6.dex */
public final class djgc extends dsqw<djgc, djfz> implements dssk {
    public static final djgc h;
    private static volatile dssr<djgc> i;
    public int a;
    public djdq e;
    public djgb g;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        djgc djgcVar = new djgc();
        h = djgcVar;
        dsqw.cc(djgc.class, djgcVar);
    }

    private djgc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new djgc();
            }
            if (i3 == 4) {
                return new djfz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djgc> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djgc.class) {
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
