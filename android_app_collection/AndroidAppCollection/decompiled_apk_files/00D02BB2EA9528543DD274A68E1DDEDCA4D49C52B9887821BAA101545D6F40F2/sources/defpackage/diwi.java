package defpackage;
/* compiled from: PG */
/* renamed from: diwi  reason: default package */
/* loaded from: classes6.dex */
public final class diwi extends dsqw<diwi, diwh> implements dssk {
    public static final diwi c;
    private static volatile dssr<diwi> e;
    public String a = "";
    public int b;
    private int d;

    static {
        diwi diwiVar = new diwi();
        c = diwiVar;
        dsqw.cc(diwi.class, diwiVar);
    }

    private diwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", diwj.a});
            }
            if (i2 == 3) {
                return new diwi();
            }
            if (i2 == 4) {
                return new diwh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diwi.class) {
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
