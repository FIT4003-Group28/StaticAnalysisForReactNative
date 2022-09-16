package defpackage;
/* compiled from: PG */
/* renamed from: avvx  reason: default package */
/* loaded from: classes2.dex */
public final class avvx extends aopi implements aoqv {
    public static final avvx a;
    private static volatile aorb d;
    public aopu b = aopi.emptyProtobufList();
    public int c;
    private int e;

    static {
        avvx avvxVar = new avvx();
        a = avvxVar;
        aopi.registerDefaultInstance(avvx.class, avvxVar);
    }

    private avvx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000", new Object[]{"e", "b", "c", avuh.t});
            case 3:
                return new avvx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avvx.class) {
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
