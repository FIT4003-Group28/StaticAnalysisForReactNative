package defpackage;
/* compiled from: PG */
/* renamed from: aute  reason: default package */
/* loaded from: classes2.dex */
public final class aute extends aopi implements aoqv {
    public static final aute a;
    private static volatile aorb d;
    public apzg b;
    private int e;
    private arag f;
    private apzg g;
    private aoux h;
    private byte i = 2;
    public aoob c = aoob.b;

    static {
        aute auteVar = new aute();
        a = auteVar;
        aopi.registerDefaultInstance(aute.class, auteVar);
    }

    private aute() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0004\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ည\u0005\u0005ᐉ\u0006\u0007ᐉ\u0004", new Object[]{"e", "f", "b", "c", "h", "g"});
            case 3:
                return new aute();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aute.class) {
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
