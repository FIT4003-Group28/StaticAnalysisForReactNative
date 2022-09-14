package defpackage;
/* compiled from: PG */
/* renamed from: dwgn  reason: default package */
/* loaded from: classes.dex */
public final class dwgn extends dsqw<dwgn, dwgm> implements dssk {
    public static final dwgn c;
    private static volatile dssr<dwgn> e;
    public dsrj<dwfl> a = dssu.b;
    public boolean b;
    private int d;

    static {
        dwgn dwgnVar = new dwgn();
        c = dwgnVar;
        dsqw.cc(dwgn.class, dwgnVar);
    }

    private dwgn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"d", "a", dwfl.class, "b"});
            }
            if (i2 == 3) {
                return new dwgn();
            }
            if (i2 == 4) {
                return new dwgm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwgn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwgn.class) {
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
