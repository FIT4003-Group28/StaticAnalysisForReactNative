package defpackage;
/* compiled from: PG */
/* renamed from: apaa  reason: default package */
/* loaded from: classes.dex */
public final class apaa extends aopi implements aoqv {
    public static final apaa a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public int c;
    private int e;

    static {
        apaa apaaVar = new apaa();
        a = apaaVar;
        aopi.registerDefaultInstance(apaa.class, apaaVar);
    }

    private apaa() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"e", "b", apab.class, "c"});
            case 3:
                return new apaa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apaa.class) {
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
