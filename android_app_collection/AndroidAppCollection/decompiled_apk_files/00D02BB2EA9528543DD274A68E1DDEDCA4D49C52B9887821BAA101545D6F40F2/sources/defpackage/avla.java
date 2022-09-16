package defpackage;
/* compiled from: PG */
/* renamed from: avla  reason: default package */
/* loaded from: classes3.dex */
public final class avla extends dsqw<avla, avkz> implements dssk {
    public static final avla d;
    private static volatile dssr<avla> e;
    public int a;
    public dlrl b;
    public dlsw c;

    static {
        avla avlaVar = new avla();
        d = avlaVar;
        dsqw.cc(avla.class, avlaVar);
    }

    private avla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new avla();
            }
            if (i2 == 4) {
                return new avkz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avla> dssrVar = e;
            if (dssrVar == null) {
                synchronized (avla.class) {
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
