package defpackage;
/* compiled from: PG */
/* renamed from: dwrs  reason: default package */
/* loaded from: classes6.dex */
public final class dwrs extends dsqw<dwrs, dwrr> implements dssk {
    public static final dwrs c;
    private static volatile dssr<dwrs> d;
    public int a;
    public boolean b;

    static {
        dwrs dwrsVar = new dwrs();
        c = dwrsVar;
        dsqw.cc(dwrs.class, dwrsVar);
    }

    private dwrs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwrs();
            }
            if (i2 == 4) {
                return new dwrr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwrs.class) {
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
