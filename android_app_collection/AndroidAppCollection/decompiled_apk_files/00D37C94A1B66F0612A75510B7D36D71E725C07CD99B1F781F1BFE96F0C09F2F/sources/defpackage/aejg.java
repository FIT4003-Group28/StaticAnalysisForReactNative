package defpackage;
/* compiled from: PG */
/* renamed from: aejg  reason: default package */
/* loaded from: classes.dex */
public final class aejg extends aopi implements aoqv {
    public static final aejg a;
    private static volatile aorb b;

    static {
        aejg aejgVar = new aejg();
        a = aejgVar;
        aopi.registerDefaultInstance(aejg.class, aejgVar);
    }

    private aejg() {
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
                return new aejg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aejg.class) {
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
