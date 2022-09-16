package defpackage;
/* compiled from: PG */
/* renamed from: aqrf  reason: default package */
/* loaded from: classes2.dex */
public final class aqrf extends aopi implements aoqv {
    public static final aqrf a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public arag e;
    public boolean f;
    public int c = 0;
    private byte h = 2;

    static {
        aqrf aqrfVar = new aqrf();
        a = aqrfVar;
        aopi.registerDefaultInstance(aqrf.class, aqrfVar);
    }

    private aqrf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ဇ\u0002\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{"d", "c", "b", "e", "f", apzg.class, aqgx.class});
            case 3:
                return new aqrf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqrf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
