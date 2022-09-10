package defpackage;
/* compiled from: PG */
/* renamed from: dxmq  reason: default package */
/* loaded from: classes6.dex */
public final class dxmq extends dsqw<dxmq, dxmp> implements dssk {
    public static final dxmq d;
    private static volatile dssr<dxmq> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxmq dxmqVar = new dxmq();
        d = dxmqVar;
        dsqw.cc(dxmq.class, dxmqVar);
    }

    private dxmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000fȻ\u0000g<\u0000", new Object[]{"b", "a", "c", dxnt.class, dxmk.class});
            }
            if (i2 == 3) {
                return new dxmq();
            }
            if (i2 == 4) {
                return new dxmp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxmq.class) {
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
