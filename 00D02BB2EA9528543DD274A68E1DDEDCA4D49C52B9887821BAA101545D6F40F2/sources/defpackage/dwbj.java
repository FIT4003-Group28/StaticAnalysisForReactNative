package defpackage;
/* compiled from: PG */
/* renamed from: dwbj  reason: default package */
/* loaded from: classes6.dex */
public final class dwbj extends dsqw<dwbj, dwbi> implements dssk {
    public static final dwbj c;
    private static volatile dssr<dwbj> d;
    public int a;
    public int b;

    static {
        dwbj dwbjVar = new dwbj();
        c = dwbjVar;
        dsqw.cc(dwbj.class, dwbjVar);
    }

    private dwbj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwbj();
            }
            if (i2 == 4) {
                return new dwbi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwbj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwbj.class) {
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
