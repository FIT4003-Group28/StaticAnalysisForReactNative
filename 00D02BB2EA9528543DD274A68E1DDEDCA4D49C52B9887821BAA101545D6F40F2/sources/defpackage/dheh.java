package defpackage;
/* compiled from: PG */
/* renamed from: dheh  reason: default package */
/* loaded from: classes6.dex */
public final class dheh extends dsqw<dheh, dheg> implements dssk {
    public static final dheh d;
    private static volatile dssr<dheh> e;
    public dsrj<dhdp> a = dssu.b;
    public String b = "";
    public dhdn c;

    static {
        dheh dhehVar = new dheh();
        d = dhehVar;
        dsqw.cc(dheh.class, dhehVar);
    }

    private dheh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\t", new Object[]{"a", dhdp.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dheh();
            }
            if (i2 == 4) {
                return new dheg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dheh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dheh.class) {
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
