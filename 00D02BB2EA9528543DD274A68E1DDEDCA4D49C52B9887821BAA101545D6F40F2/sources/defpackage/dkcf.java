package defpackage;
/* compiled from: PG */
/* renamed from: dkcf  reason: default package */
/* loaded from: classes6.dex */
public final class dkcf extends dsqw<dkcf, dkce> implements dssk {
    public static final dkcf d;
    private static volatile dssr<dkcf> e;
    public int a;
    public dmcc b;
    public dkcd c;

    static {
        dkcf dkcfVar = new dkcf();
        d = dkcfVar;
        dsqw.cc(dkcf.class, dkcfVar);
    }

    private dkcf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkcf();
            }
            if (i2 == 4) {
                return new dkce();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkcf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkcf.class) {
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
