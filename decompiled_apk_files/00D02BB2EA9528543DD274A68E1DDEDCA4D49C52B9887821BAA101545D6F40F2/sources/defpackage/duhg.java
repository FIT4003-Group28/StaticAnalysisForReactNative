package defpackage;
/* compiled from: PG */
/* renamed from: duhg  reason: default package */
/* loaded from: classes6.dex */
public final class duhg extends dsqw<duhg, duhf> implements dssk {
    public static final duhg d;
    private static volatile dssr<duhg> e;
    public String a = "";
    public long b;
    public int c;

    static {
        duhg duhgVar = new duhg();
        d = duhgVar;
        dsqw.cc(duhg.class, duhgVar);
    }

    private duhg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new duhg();
            }
            if (i2 == 4) {
                return new duhf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duhg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duhg.class) {
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
