package defpackage;
/* compiled from: PG */
/* renamed from: aruo  reason: default package */
/* loaded from: classes2.dex */
public final class aruo extends aopi implements aoqv {
    public static final aruo a;
    private static volatile aorb e;
    public arpa b;
    public apzg c;
    public arfo d;
    private int f;
    private byte g = 2;

    static {
        aruo aruoVar = new aruo();
        a = aruoVar;
        aopi.registerDefaultInstance(aruo.class, aruoVar);
    }

    private aruo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aruo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aruo.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
