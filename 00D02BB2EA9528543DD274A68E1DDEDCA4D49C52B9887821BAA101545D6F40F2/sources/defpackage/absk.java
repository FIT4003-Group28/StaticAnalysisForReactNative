package defpackage;
/* compiled from: PG */
/* renamed from: absk  reason: default package */
/* loaded from: classes2.dex */
public final class absk extends dsqw<absk, absj> implements dssk {
    public static final absk d;
    private static volatile dssr<absk> e;
    public int a;
    public dsrj<dqfq> b = dssu.b;
    public abse c;

    static {
        absk abskVar = new absk();
        d = abskVar;
        dsqw.cc(absk.class, abskVar);
    }

    private absk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", dqfq.class, "c"});
            }
            if (i2 == 3) {
                return new absk();
            }
            if (i2 == 4) {
                return new absj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<absk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (absk.class) {
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
