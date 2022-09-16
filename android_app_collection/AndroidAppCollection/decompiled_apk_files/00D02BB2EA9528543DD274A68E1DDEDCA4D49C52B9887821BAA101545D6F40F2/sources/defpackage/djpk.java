package defpackage;
/* compiled from: PG */
/* renamed from: djpk  reason: default package */
/* loaded from: classes6.dex */
public final class djpk extends dsqw<djpk, djpj> implements dssk {
    public static final djpk e;
    private static volatile dssr<djpk> f;
    public int a;
    public long c;
    public String b = "";
    public String d = "";

    static {
        djpk djpkVar = new djpk();
        e = djpkVar;
        dsqw.cc(djpk.class, djpkVar);
    }

    private djpk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djpk();
            }
            if (i2 == 4) {
                return new djpj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djpk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
