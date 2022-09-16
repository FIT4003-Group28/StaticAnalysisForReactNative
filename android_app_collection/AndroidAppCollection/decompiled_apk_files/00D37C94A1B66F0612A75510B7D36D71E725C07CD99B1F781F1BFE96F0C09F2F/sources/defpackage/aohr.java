package defpackage;
/* compiled from: PG */
/* renamed from: aohr  reason: default package */
/* loaded from: classes.dex */
public final class aohr extends aopi implements aoqv {
    public static final aohr a;
    private static volatile aorb e;
    public aohs b;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        aohr aohrVar = new aohr();
        a = aohrVar;
        aopi.registerDefaultInstance(aohr.class, aohrVar);
    }

    private aohr() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0004\t", new Object[]{"c", aohn.class, "d", aohq.class, "b"});
            case 3:
                return new aohr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aohr.class) {
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
