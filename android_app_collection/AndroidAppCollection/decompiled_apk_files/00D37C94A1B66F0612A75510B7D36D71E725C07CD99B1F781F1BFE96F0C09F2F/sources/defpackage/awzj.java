package defpackage;
/* compiled from: PG */
/* renamed from: awzj  reason: default package */
/* loaded from: classes2.dex */
public final class awzj extends aopi implements aoqv {
    public static final awzj a;
    private static volatile aorb b;
    private aoqp c = aoqp.a;
    private aoqp d = aoqp.a;

    static {
        awzj awzjVar = new awzj();
        a = awzjVar;
        aopi.registerDefaultInstance(awzj.class, awzjVar);
    }

    private awzj() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0018\u0019\u0002\u0002\u0000\u0000\u00182\u00192", new Object[]{"c", awzh.a, "d", awzi.a});
            case 3:
                return new awzj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awzj.class) {
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
