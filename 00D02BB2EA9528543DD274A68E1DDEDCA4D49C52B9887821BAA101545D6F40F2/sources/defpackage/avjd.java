package defpackage;
/* compiled from: PG */
/* renamed from: avjd  reason: default package */
/* loaded from: classes3.dex */
public final class avjd extends dsqw<avjd, avjc> implements dssk {
    public static final avjd e;
    private static volatile dssr<avjd> f;
    public int a;
    public dsrj<avix> b = dssu.b;
    public boolean c = true;
    public boolean d;

    static {
        avjd avjdVar = new avjd();
        e = avjdVar;
        dsqw.cc(avjd.class, avjdVar);
    }

    private avjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", avix.class, "c", "d"});
            }
            if (i2 == 3) {
                return new avjd();
            }
            if (i2 == 4) {
                return new avjc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avjd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (avjd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
