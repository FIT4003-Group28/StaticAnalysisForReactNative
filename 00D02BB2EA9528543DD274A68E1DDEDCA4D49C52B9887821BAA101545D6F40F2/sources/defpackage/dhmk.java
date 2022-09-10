package defpackage;
/* compiled from: PG */
/* renamed from: dhmk  reason: default package */
/* loaded from: classes6.dex */
public final class dhmk extends dsqw<dhmk, dhmj> implements dssk {
    public static final dhmk e;
    private static volatile dssr<dhmk> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        dhmk dhmkVar = new dhmk();
        e = dhmkVar;
        dsqw.cc(dhmk.class, dhmkVar);
    }

    private dhmk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhmk();
            }
            if (i2 == 4) {
                return new dhmj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhmk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
