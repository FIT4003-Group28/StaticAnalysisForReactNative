package defpackage;
/* compiled from: PG */
/* renamed from: dwpz  reason: default package */
/* loaded from: classes6.dex */
public final class dwpz extends dsqw<dwpz, dwpy> implements dssk {
    public static final dwpz c;
    private static volatile dssr<dwpz> d;
    public int a;
    public boolean b;

    static {
        dwpz dwpzVar = new dwpz();
        c = dwpzVar;
        dsqw.cc(dwpz.class, dwpzVar);
    }

    private dwpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwpz();
            }
            if (i2 == 4) {
                return new dwpy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwpz.class) {
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
