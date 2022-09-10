package defpackage;
/* compiled from: PG */
/* renamed from: dgec  reason: default package */
/* loaded from: classes6.dex */
public final class dgec extends dsqw<dgec, dgeb> implements dssk {
    public static final dgec i;
    private static volatile dssr<dgec> j;
    public int a;
    public dgdw d;
    public dggq f;
    public dggq g;
    public String b = "";
    public String c = "";
    public dsrj<dgdw> e = dssu.b;
    public String h = "";

    static {
        dgec dgecVar = new dgec();
        i = dgecVar;
        dsqw.cc(dgec.class, dgecVar);
    }

    private dgec() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0004\u0007ဈ\b\tဉ\u0005", new Object[]{"a", "b", "c", "d", "e", dgdw.class, "f", "h", "g"});
            }
            if (i3 == 3) {
                return new dgec();
            }
            if (i3 == 4) {
                return new dgeb();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgec> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dgec.class) {
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
