package defpackage;
/* compiled from: PG */
/* renamed from: avym  reason: default package */
/* loaded from: classes2.dex */
public final class avym extends aopi implements aoqv {
    public static final avym a;
    private static volatile aorb d;
    public int b;
    public aopu c = aopi.emptyProtobufList();
    private int e;

    static {
        avym avymVar = new avym();
        a = avymVar;
        aopi.registerDefaultInstance(avym.class, avymVar);
    }

    private avym() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"e", "b", avxu.a(), "c"});
            case 3:
                return new avym();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avym.class) {
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
