package defpackage;
/* compiled from: PG */
/* renamed from: aslf  reason: default package */
/* loaded from: classes2.dex */
public final class aslf extends aopi implements aoqv {
    public static final aslf a;
    private static volatile aorb b;
    private int c;
    private arhh d;

    static {
        aslf aslfVar = new aslf();
        a = aslfVar;
        aopi.registerDefaultInstance(aslf.class, aslfVar);
    }

    private aslf() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဉ\u0002", new Object[]{"c", "d"});
            case 3:
                return new aslf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aslf.class) {
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
