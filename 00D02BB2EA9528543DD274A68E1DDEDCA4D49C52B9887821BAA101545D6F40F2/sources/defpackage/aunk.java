package defpackage;
/* compiled from: PG */
/* renamed from: aunk  reason: default package */
/* loaded from: classes2.dex */
public final class aunk extends dsqw<aunk, aunj> implements dssk {
    public static final aunk b;
    private static volatile dssr<aunk> c;
    public dsrj<aunm> a;

    static {
        aunk aunkVar = new aunk();
        b = aunkVar;
        dsqw.cc(aunk.class, aunkVar);
    }

    private aunk() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", aunm.class});
            }
            if (i2 == 3) {
                return new aunk();
            }
            if (i2 == 4) {
                return new aunj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aunk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aunk.class) {
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
