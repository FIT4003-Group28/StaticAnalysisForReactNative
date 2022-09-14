package defpackage;
/* compiled from: PG */
/* renamed from: dwff  reason: default package */
/* loaded from: classes6.dex */
public final class dwff extends dsqw<dwff, dwfe> implements dssk {
    public static final dwff c;
    private static volatile dssr<dwff> d;
    public int a;
    public boolean b;

    static {
        dwff dwffVar = new dwff();
        c = dwffVar;
        dsqw.cc(dwff.class, dwffVar);
    }

    private dwff() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwff();
            }
            if (i2 == 4) {
                return new dwfe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwff> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwff.class) {
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
