package defpackage;
/* compiled from: PG */
/* renamed from: asht  reason: default package */
/* loaded from: classes2.dex */
public final class asht extends aopi implements aoqv {
    public static final asht a;
    private static volatile aorb e;
    public arpa b;
    public ashg c;
    private int f;
    private ashu g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        asht ashtVar = new asht();
        a = ashtVar;
        aopi.registerDefaultInstance(asht.class, ashtVar);
    }

    private asht() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003", new Object[]{"f", "b", "c", "g", "d"});
            case 3:
                return new asht();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asht.class) {
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
