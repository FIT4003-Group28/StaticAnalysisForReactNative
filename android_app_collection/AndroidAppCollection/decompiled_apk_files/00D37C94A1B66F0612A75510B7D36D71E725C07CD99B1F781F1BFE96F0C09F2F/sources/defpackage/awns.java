package defpackage;
/* compiled from: PG */
/* renamed from: awns  reason: default package */
/* loaded from: classes2.dex */
public final class awns extends aopi implements aoqv {
    public static final awns a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        awns awnsVar = new awns();
        a = awnsVar;
        aopi.registerDefaultInstance(awns.class, awnsVar);
    }

    private awns() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", awnt.class, "c", awnu.class});
            case 3:
                return new awns();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awns.class) {
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
