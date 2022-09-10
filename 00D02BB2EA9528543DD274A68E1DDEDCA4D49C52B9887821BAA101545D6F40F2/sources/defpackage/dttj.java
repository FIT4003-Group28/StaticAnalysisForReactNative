package defpackage;
/* compiled from: PG */
/* renamed from: dttj  reason: default package */
/* loaded from: classes6.dex */
public final class dttj extends dsqw<dttj, dtti> implements dssk {
    public static final dttj b;
    private static volatile dssr<dttj> c;
    public dsrj<dttp> a = dssu.b;

    static {
        dttj dttjVar = new dttj();
        b = dttjVar;
        dsqw.cc(dttj.class, dttjVar);
    }

    private dttj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dttp.class});
            }
            if (i2 == 3) {
                return new dttj();
            }
            if (i2 == 4) {
                return new dtti();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dttj.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
