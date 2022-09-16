package defpackage;
/* compiled from: PG */
/* renamed from: avlz  reason: default package */
/* loaded from: classes2.dex */
public final class avlz extends aopi implements aoqv {
    public static final avlz a;
    private static volatile aorb b;

    static {
        avlz avlzVar = new avlz();
        a = avlzVar;
        aopi.registerDefaultInstance(avlz.class, avlzVar);
    }

    private avlz() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new avlz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avlz.class) {
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
