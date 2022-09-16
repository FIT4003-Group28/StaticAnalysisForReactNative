package defpackage;
/* compiled from: PG */
/* renamed from: dxlq  reason: default package */
/* loaded from: classes6.dex */
public final class dxlq extends dsqw<dxlq, dxlp> implements dssk {
    public static final dxlq d;
    private static volatile dssr<dxlq> e;
    public dxwi a;
    public dsrj<dxmq> b = dssu.b;
    public long c;

    static {
        dxlq dxlqVar = new dxlq();
        d = dxlqVar;
        dsqw.cc(dxlq.class, dxlqVar);
    }

    private dxlq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\u0002", new Object[]{"a", "b", dxmq.class, "c"});
            }
            if (i2 == 3) {
                return new dxlq();
            }
            if (i2 == 4) {
                return new dxlp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxlq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxlq.class) {
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
