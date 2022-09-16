package defpackage;
/* compiled from: PG */
/* renamed from: djoa  reason: default package */
/* loaded from: classes6.dex */
public final class djoa extends dsqw<djoa, djnz> implements dssk {
    public static final djoa c;
    private static volatile dssr<djoa> d;
    public int a;
    public int b;

    static {
        djoa djoaVar = new djoa();
        c = djoaVar;
        dsqw.cc(djoa.class, djoaVar);
    }

    private djoa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djoa();
            }
            if (i2 == 4) {
                return new djnz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djoa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djoa.class) {
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
