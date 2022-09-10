package defpackage;
/* compiled from: PG */
/* renamed from: avjf  reason: default package */
/* loaded from: classes3.dex */
public final class avjf extends dsqw<avjf, avje> implements dssk {
    public static final avjf a;
    private static volatile dssr<avjf> b;

    static {
        avjf avjfVar = new avjf();
        a = avjfVar;
        dsqw.cc(avjf.class, avjfVar);
    }

    private avjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new avjf();
            }
            if (i2 == 4) {
                return new avje();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avjf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (avjf.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
