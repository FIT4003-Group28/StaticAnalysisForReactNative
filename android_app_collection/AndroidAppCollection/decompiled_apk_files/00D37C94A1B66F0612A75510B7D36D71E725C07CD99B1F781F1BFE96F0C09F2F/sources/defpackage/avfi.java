package defpackage;
/* compiled from: PG */
/* renamed from: avfi  reason: default package */
/* loaded from: classes2.dex */
public final class avfi extends aopi implements aoqv {
    public static final avfi a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private avfk e;
    private byte f = 2;

    static {
        avfi avfiVar = new avfi();
        a = avfiVar;
        aopi.registerDefaultInstance(avfi.class, avfiVar);
    }

    private avfi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0006ᐉ\u0005", new Object[]{"c", "d", "e"});
            case 3:
                return new avfi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avfi.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
