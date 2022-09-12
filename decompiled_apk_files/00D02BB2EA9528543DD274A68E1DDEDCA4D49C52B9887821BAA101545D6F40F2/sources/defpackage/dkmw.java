package defpackage;
/* compiled from: PG */
/* renamed from: dkmw  reason: default package */
/* loaded from: classes6.dex */
public final class dkmw extends dsqw<dkmw, dkmv> implements dssk {
    public static final dkmw d;
    private static volatile dssr<dkmw> f;
    public boolean a;
    public dsrj<String> b = dssu.b;
    public boolean c;
    private int e;

    static {
        dkmw dkmwVar = new dkmw();
        d = dkmwVar;
        dsqw.cc(dkmw.class, dkmwVar);
    }

    private dkmw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkmw();
            }
            if (i2 == 4) {
                return new dkmv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkmw.class) {
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
