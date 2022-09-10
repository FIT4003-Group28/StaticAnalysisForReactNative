package defpackage;
/* compiled from: PG */
/* renamed from: chut  reason: default package */
/* loaded from: classes4.dex */
public final class chut extends dsqw<chut, chuk> implements dssk {
    public static final chut e;
    private static volatile dssr<chut> f;
    public int a;
    public chus c;
    public dsrj<chum> b = dssu.b;
    public dsrj<chuo> d = dssu.b;

    static {
        chut chutVar = new chut();
        e = chutVar;
        dsqw.cc(chut.class, chutVar);
    }

    private chut() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003\u001b", new Object[]{"a", "b", chum.class, "c", "d", chuo.class});
            }
            if (i2 == 3) {
                return new chut();
            }
            if (i2 == 4) {
                return new chuk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chut> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chut.class) {
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
