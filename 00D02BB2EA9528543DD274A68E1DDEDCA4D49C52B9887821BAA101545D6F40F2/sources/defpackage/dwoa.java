package defpackage;
/* compiled from: PG */
/* renamed from: dwoa  reason: default package */
/* loaded from: classes.dex */
public final class dwoa extends dsqw<dwoa, dwnz> implements dssk {
    public static final dwoa c;
    private static volatile dssr<dwoa> e;
    public int a = 420;
    public int b = 240;
    private int d;

    static {
        dwoa dwoaVar = new dwoa();
        c = dwoaVar;
        dsqw.cc(dwoa.class, dwoaVar);
    }

    private dwoa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwoa();
            }
            if (i2 == 4) {
                return new dwnz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwoa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwoa.class) {
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
