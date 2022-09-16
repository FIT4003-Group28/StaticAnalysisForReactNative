package defpackage;
/* compiled from: PG */
/* renamed from: diuu  reason: default package */
/* loaded from: classes6.dex */
public final class diuu extends dsqw<diuu, diur> implements dssk {
    public static final diuu e;
    private static volatile dssr<diuu> f;
    public int a;
    public dpop b;
    public String c = "";
    public dsrj<diut> d = dssu.b;

    static {
        diuu diuuVar = new diuu();
        e = diuuVar;
        dsqw.cc(diuu.class, diuuVar);
    }

    private diuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "d", diut.class, "c"});
            }
            if (i2 == 3) {
                return new diuu();
            }
            if (i2 == 4) {
                return new diur();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diuu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diuu.class) {
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
