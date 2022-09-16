package defpackage;
/* compiled from: PG */
/* renamed from: asba  reason: default package */
/* loaded from: classes2.dex */
public final class asba extends aopi implements aoqv {
    public static final asba a;
    private static volatile aorb c;
    public arpa b;
    private int d;
    private apzg e;
    private byte f = 2;

    static {
        asba asbaVar = new asba();
        a = asbaVar;
        aopi.registerDefaultInstance(asba.class, asbaVar);
    }

    private asba() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"d", "b", "e"});
            case 3:
                return new asba();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (asba.class) {
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
