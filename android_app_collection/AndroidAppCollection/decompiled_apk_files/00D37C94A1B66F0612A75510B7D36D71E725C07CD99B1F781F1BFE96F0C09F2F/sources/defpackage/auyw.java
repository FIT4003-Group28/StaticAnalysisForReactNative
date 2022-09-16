package defpackage;
/* compiled from: PG */
/* renamed from: auyw  reason: default package */
/* loaded from: classes2.dex */
public final class auyw extends aopi implements aoqv {
    public static final auyw a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private byte f = 2;

    static {
        auyw auywVar = new auyw();
        a = auywVar;
        aopi.registerDefaultInstance(auyw.class, auywVar);
    }

    private auyw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0004ᐉ\u0003", new Object[]{"c", "d", "e"});
            case 3:
                return new auyw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auyw.class) {
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
