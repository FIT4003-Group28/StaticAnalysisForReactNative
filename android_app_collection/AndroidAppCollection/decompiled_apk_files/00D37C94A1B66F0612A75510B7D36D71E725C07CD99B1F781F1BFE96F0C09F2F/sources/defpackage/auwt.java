package defpackage;
/* compiled from: PG */
/* renamed from: auwt  reason: default package */
/* loaded from: classes2.dex */
public final class auwt extends aopi implements aoqv {
    public static final auwt a;
    public static final aopg b;
    public static final aopg c;
    private static volatile aorb d;

    static {
        auwt auwtVar = new auwt();
        a = auwtVar;
        aopi.registerDefaultInstance(auwt.class, auwtVar);
        b = aopi.newSingularGeneratedExtension(auxb.a, false, null, null, 128093714, aosj.BOOL, Boolean.class);
        c = aopi.newSingularGeneratedExtension(auxb.a, false, null, null, 127992852, aosj.BOOL, Boolean.class);
    }

    private auwt() {
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
                return new auwt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auwt.class) {
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
