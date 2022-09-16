package defpackage;
/* compiled from: PG */
/* renamed from: asya  reason: default package */
/* loaded from: classes2.dex */
public final class asya extends aopi implements aoqv {
    public static final asya a;
    private static volatile aorb c;
    public arpa b;
    private int d;
    private apzg e;
    private arbf f;
    private byte g = 2;

    static {
        asya asyaVar = new asya();
        a = asyaVar;
        aopi.registerDefaultInstance(asya.class, asyaVar);
    }

    private asya() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002̉ᐉ\u0003", new Object[]{"d", "b", "e", "f"});
            case 3:
                return new asya();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (asya.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
