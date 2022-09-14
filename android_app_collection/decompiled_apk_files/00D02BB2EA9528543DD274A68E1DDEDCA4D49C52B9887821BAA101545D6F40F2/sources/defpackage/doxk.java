package defpackage;
/* compiled from: PG */
/* renamed from: doxk  reason: default package */
/* loaded from: classes6.dex */
public final class doxk extends dsqw<doxk, doxh> implements dssk {
    public static final doxk c;
    private static volatile dssr<doxk> e;
    public dsrj<String> a = dssu.b;
    public int b;
    private int d;

    static {
        doxk doxkVar = new doxk();
        c = doxkVar;
        dsqw.cc(doxk.class, doxkVar);
    }

    private doxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0001", new Object[]{"d", "a", "b", doxi.a});
            }
            if (i2 == 3) {
                return new doxk();
            }
            if (i2 == 4) {
                return new doxh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doxk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
