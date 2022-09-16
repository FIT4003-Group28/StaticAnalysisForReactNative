package defpackage;
/* compiled from: PG */
/* renamed from: avmj  reason: default package */
/* loaded from: classes2.dex */
public final class avmj extends aopi implements aoqv {
    private static final avmj a;
    private static volatile aorb b;

    static {
        avmj avmjVar = new avmj();
        a = avmjVar;
        aopi.registerDefaultInstance(avmj.class, avmjVar);
    }

    private avmj() {
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
                return new avmj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avmj.class) {
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
