package defpackage;
/* compiled from: PG */
/* renamed from: ailt  reason: default package */
/* loaded from: classes2.dex */
public final class ailt extends dsqw<ailt, ails> implements dssk {
    public static final ailt d;
    private static volatile dssr<ailt> e;
    public int a;
    public long b;
    public dsrj<ailx> c = dssu.b;

    static {
        ailt ailtVar = new ailt();
        d = ailtVar;
        dsqw.cc(ailt.class, ailtVar);
    }

    private ailt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", ailx.class});
            }
            if (i2 == 3) {
                return new ailt();
            }
            if (i2 == 4) {
                return new ails();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ailt.class) {
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
