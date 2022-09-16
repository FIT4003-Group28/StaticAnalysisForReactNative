package defpackage;
/* compiled from: PG */
/* renamed from: avut  reason: default package */
/* loaded from: classes2.dex */
public final class avut extends aopi implements aoqv {
    public static final avut a;
    private static volatile aorb c;
    public float b;
    private int d;

    static {
        avut avutVar = new avut();
        a = avutVar;
        aopi.registerDefaultInstance(avut.class, avutVar);
    }

    private avut() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"d", "b"});
            case 3:
                return new avut();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avut.class) {
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
