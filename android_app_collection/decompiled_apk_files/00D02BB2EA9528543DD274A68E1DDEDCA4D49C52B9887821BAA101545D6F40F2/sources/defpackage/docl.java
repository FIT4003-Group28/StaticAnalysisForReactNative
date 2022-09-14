package defpackage;
/* compiled from: PG */
/* renamed from: docl  reason: default package */
/* loaded from: classes6.dex */
public final class docl extends dsqw<docl, doci> implements dssk {
    public static final docl d;
    private static volatile dssr<docl> e;
    public int a;
    public dsrj<dock> b = dssu.b;
    public double c;

    static {
        docl doclVar = new docl();
        d = doclVar;
        dsqw.cc(docl.class, doclVar);
    }

    private docl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002က\u0000", new Object[]{"a", "b", dock.class, "c"});
            }
            if (i2 == 3) {
                return new docl();
            }
            if (i2 == 4) {
                return new doci();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<docl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (docl.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
