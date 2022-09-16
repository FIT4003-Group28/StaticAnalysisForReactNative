package defpackage;
/* compiled from: PG */
/* renamed from: awcv  reason: default package */
/* loaded from: classes2.dex */
public final class awcv extends aopi implements aoqv {
    public static final awcv a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awcv awcvVar = new awcv();
        a = awcvVar;
        aopi.registerDefaultInstance(awcv.class, awcvVar);
    }

    private awcv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000ﺯ䨣免厯\u0003\u0000\u0000\u0003ﺯ䨣ᐼ\u0000\ue14e䨥ᐼ\u0000免厯ᐼ\u0000", new Object[]{"c", "b", awcx.class, awcu.class, awcr.class});
            case 3:
                return new awcv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awcv.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
