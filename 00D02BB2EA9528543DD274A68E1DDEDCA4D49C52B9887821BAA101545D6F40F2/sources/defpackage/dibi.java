package defpackage;
/* compiled from: PG */
/* renamed from: dibi  reason: default package */
/* loaded from: classes6.dex */
public final class dibi extends dsqw<dibi, dibh> implements dssk {
    public static final dibi d;
    private static volatile dssr<dibi> f;
    public int a;
    public dsrj<dpre> b = dssu.b;
    public dpql c;
    private int e;

    static {
        dibi dibiVar = new dibi();
        d = dibiVar;
        dsqw.cc(dibi.class, dibiVar);
    }

    private dibi() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0005ဉ\u0002", new Object[]{"e", "a", "b", dpre.class, "c"});
            }
            if (i2 == 3) {
                return new dibi();
            }
            if (i2 == 4) {
                return new dibh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dibi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dibi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
