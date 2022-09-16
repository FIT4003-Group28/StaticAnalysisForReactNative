package defpackage;
/* compiled from: PG */
/* renamed from: eayd  reason: default package */
/* loaded from: classes6.dex */
public final class eayd extends dsqw<eayd, eayc> implements dssk {
    public static final eayd g;
    private static volatile dssr<eayd> h;
    public int a;
    public eayf b;
    public eayh c;
    public dsrf d;
    public boolean e;
    public boolean f;

    static {
        eayd eaydVar = new eayd();
        g = eaydVar;
        dsqw.cc(eayd.class, eaydVar);
    }

    private eayd() {
        dssu<Object> dssuVar = dssu.b;
        this.d = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"a", "b", "c", "d", eayj.c(), "e", "f"});
            }
            if (i2 == 3) {
                return new eayd();
            }
            if (i2 == 4) {
                return new eayc();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (eayd.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
