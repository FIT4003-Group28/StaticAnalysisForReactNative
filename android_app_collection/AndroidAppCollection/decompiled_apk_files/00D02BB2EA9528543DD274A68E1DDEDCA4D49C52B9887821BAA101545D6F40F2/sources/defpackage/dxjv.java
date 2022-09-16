package defpackage;
/* compiled from: PG */
/* renamed from: dxjv  reason: default package */
/* loaded from: classes6.dex */
public final class dxjv extends dsqw<dxjv, dxju> implements dssk {
    public static final dxjv c;
    private static volatile dssr<dxjv> d;
    public dsrj<dxmq> a = dssu.b;
    public String b = "";

    static {
        dxjv dxjvVar = new dxjv();
        c = dxjvVar;
        dsqw.cc(dxjv.class, dxjvVar);
    }

    private dxjv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"a", dxmq.class, "b"});
            }
            if (i2 == 3) {
                return new dxjv();
            }
            if (i2 == 4) {
                return new dxju();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxjv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxjv.class) {
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
