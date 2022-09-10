package defpackage;
/* compiled from: PG */
/* renamed from: dohk  reason: default package */
/* loaded from: classes6.dex */
public final class dohk extends dsqw<dohk, dohd> implements dssk {
    public static final dohk f;
    private static volatile dssr<dohk> g;
    public int a;
    public dsrj<dohf> b = dssu.b;
    public dsrj<dohh> c = dssu.b;
    public dsrj<dohj> d = dssu.b;
    public dpqy e;

    static {
        dohk dohkVar = new dohk();
        f = dohkVar;
        dsqw.cc(dohk.class, dohkVar);
    }

    private dohk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"a", "b", dohf.class, "c", dohh.class, "d", dohj.class, "e"});
            }
            if (i2 == 3) {
                return new dohk();
            }
            if (i2 == 4) {
                return new dohd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dohk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
