package defpackage;
/* compiled from: PG */
/* renamed from: dhnk  reason: default package */
/* loaded from: classes6.dex */
public final class dhnk extends dsqw<dhnk, dhnh> implements dssk {
    public static final dhnk c;
    private static volatile dssr<dhnk> e;
    public String a = "";
    public dsrj<dhnj> b = dssu.b;
    private int d;

    static {
        dhnk dhnkVar = new dhnk();
        c = dhnkVar;
        dsqw.cc(dhnk.class, dhnkVar);
    }

    private dhnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dhnj.class});
            }
            if (i2 == 3) {
                return new dhnk();
            }
            if (i2 == 4) {
                return new dhnh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhnk.class) {
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
