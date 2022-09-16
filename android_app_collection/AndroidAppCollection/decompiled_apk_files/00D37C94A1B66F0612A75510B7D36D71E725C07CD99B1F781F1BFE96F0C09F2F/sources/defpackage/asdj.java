package defpackage;
/* compiled from: PG */
/* renamed from: asdj  reason: default package */
/* loaded from: classes2.dex */
public final class asdj extends aopi implements aoqv {
    public static final asdj a;
    private static volatile aorb b;

    static {
        asdj asdjVar = new asdj();
        a = asdjVar;
        aopi.registerDefaultInstance(asdj.class, asdjVar);
    }

    private asdj() {
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
                return new asdj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asdj.class) {
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
