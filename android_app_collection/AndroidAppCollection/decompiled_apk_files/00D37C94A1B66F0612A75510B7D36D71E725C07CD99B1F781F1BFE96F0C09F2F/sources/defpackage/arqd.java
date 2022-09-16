package defpackage;
/* compiled from: PG */
/* renamed from: arqd  reason: default package */
/* loaded from: classes2.dex */
public final class arqd extends aopi implements aoqv {
    public static final arqd a;
    private static volatile aorb b;

    static {
        arqd arqdVar = new arqd();
        a = arqdVar;
        aopi.registerDefaultInstance(arqd.class, arqdVar);
    }

    private arqd() {
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
                return new arqd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arqd.class) {
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
