package defpackage;
/* compiled from: PG */
/* renamed from: auba  reason: default package */
/* loaded from: classes2.dex */
public final class auba extends aopi implements aoqv {
    public static final auba a;
    private static volatile aorb d;
    public int b;
    public auaz c;
    private aubh e;
    private byte f = 2;

    static {
        auba aubaVar = new auba();
        a = aubaVar;
        aopi.registerDefaultInstance(auba.class, aubaVar);
    }

    private auba() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uedd3\u2bf1立㵯\u0002\u0000\u0000\u0002\uedd3\u2bf1ᐉ\u0000立㵯ᐉ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new auba();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auba.class) {
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
