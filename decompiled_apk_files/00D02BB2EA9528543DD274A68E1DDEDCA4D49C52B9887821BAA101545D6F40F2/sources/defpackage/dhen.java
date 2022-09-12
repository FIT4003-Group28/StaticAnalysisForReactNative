package defpackage;
/* compiled from: PG */
/* renamed from: dhen  reason: default package */
/* loaded from: classes6.dex */
public final class dhen extends dsqw<dhen, dhem> implements dssk {
    public static final dhen c;
    private static volatile dssr<dhen> d;
    public String a = "";
    public dsrj<String> b = dssu.b;

    static {
        dhen dhenVar = new dhen();
        c = dhenVar;
        dsqw.cc(dhen.class, dhenVar);
    }

    private dhen() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhen();
            }
            if (i2 == 4) {
                return new dhem();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhen> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhen.class) {
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
