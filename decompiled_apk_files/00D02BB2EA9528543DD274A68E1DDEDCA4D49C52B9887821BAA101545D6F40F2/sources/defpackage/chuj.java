package defpackage;
/* compiled from: PG */
/* renamed from: chuj  reason: default package */
/* loaded from: classes4.dex */
public final class chuj extends dsqw<chuj, chui> implements dssk {
    public static final chuj e;
    private static volatile dssr<chuj> f;
    public int a;
    public int b;
    public dsrj<chxr> c = dssu.b;
    public String d = "";

    static {
        chuj chujVar = new chuj();
        e = chujVar;
        dsqw.cc(chuj.class, chujVar);
    }

    private chuj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", drrx.c(), "c", chxr.class, "d"});
            }
            if (i2 == 3) {
                return new chuj();
            }
            if (i2 == 4) {
                return new chui();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chuj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chuj.class) {
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
