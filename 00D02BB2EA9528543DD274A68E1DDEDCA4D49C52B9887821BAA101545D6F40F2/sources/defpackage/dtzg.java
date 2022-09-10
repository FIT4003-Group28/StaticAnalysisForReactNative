package defpackage;
/* compiled from: PG */
/* renamed from: dtzg  reason: default package */
/* loaded from: classes6.dex */
public final class dtzg extends dsqw<dtzg, dtzf> implements dssk {
    public static final dtzg c;
    private static volatile dssr<dtzg> d;
    public String a = "";
    public String b = "";

    static {
        dtzg dtzgVar = new dtzg();
        c = dtzgVar;
        dsqw.cc(dtzg.class, dtzgVar);
    }

    private dtzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtzg();
            }
            if (i2 == 4) {
                return new dtzf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtzg.class) {
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
