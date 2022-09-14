package defpackage;
/* compiled from: PG */
/* renamed from: chid  reason: default package */
/* loaded from: classes4.dex */
public final class chid extends dsqw<chid, chic> implements dssk {
    public static final chid c;
    private static volatile dssr<chid> d;
    public int a;
    public djft b;

    static {
        chid chidVar = new chid();
        c = chidVar;
        dsqw.cc(chid.class, chidVar);
    }

    private chid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chid();
            }
            if (i2 == 4) {
                return new chic();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chid> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chid.class) {
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
