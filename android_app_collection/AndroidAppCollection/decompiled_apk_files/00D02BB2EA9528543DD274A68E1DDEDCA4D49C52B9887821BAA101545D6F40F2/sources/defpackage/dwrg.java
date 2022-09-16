package defpackage;
/* compiled from: PG */
/* renamed from: dwrg  reason: default package */
/* loaded from: classes6.dex */
public final class dwrg extends dsqw<dwrg, dwrd> implements dssk {
    public static final dwrg d;
    private static volatile dssr<dwrg> e;
    public int a;
    public dwpc b;
    public int c;

    static {
        dwrg dwrgVar = new dwrg();
        d = dwrgVar;
        dsqw.cc(dwrg.class, dwrgVar);
    }

    private dwrg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dwre.a});
            }
            if (i2 == 3) {
                return new dwrg();
            }
            if (i2 == 4) {
                return new dwrd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwrg.class) {
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
