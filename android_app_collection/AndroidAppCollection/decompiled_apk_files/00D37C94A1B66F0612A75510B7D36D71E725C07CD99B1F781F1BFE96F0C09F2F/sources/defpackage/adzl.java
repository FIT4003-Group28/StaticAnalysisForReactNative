package defpackage;
/* compiled from: PG */
/* renamed from: adzl  reason: default package */
/* loaded from: classes.dex */
public final class adzl extends aopi implements aoqv {
    public static final adzl a;
    private static volatile aorb b;

    static {
        adzl adzlVar = new adzl();
        a = adzlVar;
        aopi.registerDefaultInstance(adzl.class, adzlVar);
    }

    private adzl() {
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
                return new adzl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (adzl.class) {
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
