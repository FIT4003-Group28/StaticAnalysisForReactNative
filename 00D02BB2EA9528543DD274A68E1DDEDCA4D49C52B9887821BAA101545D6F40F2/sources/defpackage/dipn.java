package defpackage;
/* compiled from: PG */
/* renamed from: dipn  reason: default package */
/* loaded from: classes6.dex */
public final class dipn extends dsqw<dipn, dipm> implements dssk {
    public static final dipn c;
    private static volatile dssr<dipn> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dipn dipnVar = new dipn();
        c = dipnVar;
        dsqw.cc(dipn.class, dipnVar);
    }

    private dipn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dipn();
            }
            if (i2 == 4) {
                return new dipm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dipn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dipn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
