package defpackage;
/* compiled from: PG */
/* renamed from: aslc  reason: default package */
/* loaded from: classes2.dex */
public final class aslc extends aopi implements aoqv {
    public static final aslc a;
    public static final aopg b;
    private static volatile aorb e;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    private int f;

    static {
        aslc aslcVar = new aslc();
        a = aslcVar;
        aopi.registerDefaultInstance(aslc.class, aslcVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aslcVar, aslcVar, null, 168118343, aosj.MESSAGE, aslc.class);
    }

    private aslc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new aslc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aslc.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
