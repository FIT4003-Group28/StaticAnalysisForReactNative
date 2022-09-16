package defpackage;
/* compiled from: PG */
/* renamed from: dubz  reason: default package */
/* loaded from: classes6.dex */
public final class dubz extends dsqw<dubz, duby> implements dssk {
    public static final dubz c;
    private static volatile dssr<dubz> d;
    public String a = "";
    public String b = "";

    static {
        dubz dubzVar = new dubz();
        c = dubzVar;
        dsqw.cc(dubz.class, dubzVar);
    }

    private dubz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dubz();
            }
            if (i2 == 4) {
                return new duby();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dubz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
