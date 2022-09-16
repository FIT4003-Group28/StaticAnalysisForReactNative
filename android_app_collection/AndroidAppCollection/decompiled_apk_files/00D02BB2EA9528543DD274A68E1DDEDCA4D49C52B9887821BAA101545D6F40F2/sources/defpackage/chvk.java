package defpackage;
/* compiled from: PG */
/* renamed from: chvk  reason: default package */
/* loaded from: classes4.dex */
public final class chvk extends dsqw<chvk, chvj> implements dssk {
    public static final chvk d;
    private static volatile dssr<chvk> e;
    public int a;
    public int b;
    public dsrj<chvo> c = dssu.b;

    static {
        chvk chvkVar = new chvk();
        d = chvkVar;
        dsqw.cc(chvk.class, chvkVar);
    }

    private chvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", "c", chvo.class});
            }
            if (i2 == 3) {
                return new chvk();
            }
            if (i2 == 4) {
                return new chvj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chvk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
