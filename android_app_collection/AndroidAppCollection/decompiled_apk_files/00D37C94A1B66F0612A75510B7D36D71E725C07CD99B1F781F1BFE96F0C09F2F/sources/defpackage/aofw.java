package defpackage;
/* compiled from: PG */
/* renamed from: aofw  reason: default package */
/* loaded from: classes.dex */
public final class aofw extends aopi implements aoqv {
    public static final aofw a;
    private static volatile aorb b;

    static {
        aofw aofwVar = new aofw();
        a = aofwVar;
        aopi.registerDefaultInstance(aofw.class, aofwVar);
    }

    private aofw() {
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
                return newMessageInfo(a, "\u0000\u0000", null);
            case 3:
                return new aofw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aofw.class) {
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
