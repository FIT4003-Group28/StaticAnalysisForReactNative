package defpackage;
/* compiled from: PG */
/* renamed from: daxk  reason: default package */
/* loaded from: classes5.dex */
public final class daxk extends dsqw<daxk, daxj> implements dssk {
    public static final daxk c;
    private static volatile dssr<daxk> e;
    public daxi a;
    public String b = "";
    private int d;

    static {
        daxk daxkVar = new daxk();
        c = daxkVar;
        dsqw.cc(daxk.class, daxkVar);
    }

    private daxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new daxk();
            }
            if (i2 == 4) {
                return new daxj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (daxk.class) {
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
