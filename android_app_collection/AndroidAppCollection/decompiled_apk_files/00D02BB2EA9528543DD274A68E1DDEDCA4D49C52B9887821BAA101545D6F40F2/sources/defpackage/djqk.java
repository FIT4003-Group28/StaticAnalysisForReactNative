package defpackage;
/* compiled from: PG */
/* renamed from: djqk  reason: default package */
/* loaded from: classes6.dex */
public final class djqk extends dsqw<djqk, djqj> implements dssk {
    public static final djqk c;
    private static volatile dssr<djqk> e;
    public String a = "";
    public dsrj<djqc> b = dssu.b;
    private int d;

    static {
        djqk djqkVar = new djqk();
        c = djqkVar;
        dsqw.cc(djqk.class, djqkVar);
    }

    private djqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", djqc.class});
            }
            if (i2 == 3) {
                return new djqk();
            }
            if (i2 == 4) {
                return new djqj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djqk.class) {
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
