package defpackage;
/* compiled from: PG */
/* renamed from: aweq  reason: default package */
/* loaded from: classes2.dex */
public final class aweq extends aopi implements aoqv {
    public static final aweq a;
    private static volatile aorb b;
    private int c;
    private apos d;
    private byte e = 2;

    static {
        aweq aweqVar = new aweq();
        a = aweqVar;
        aopi.registerDefaultInstance(aweq.class, aweqVar);
    }

    private aweq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue5d8☢\ue5d8☢\u0001\u0000\u0000\u0001\ue5d8☢ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aweq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aweq.class) {
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
