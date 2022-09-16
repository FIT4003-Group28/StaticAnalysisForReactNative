package defpackage;
/* compiled from: PG */
/* renamed from: areh  reason: default package */
/* loaded from: classes2.dex */
public final class areh extends aopi implements aoqv {
    public static final areh a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        areh arehVar = new areh();
        a = arehVar;
        aopi.registerDefaultInstance(areh.class, arehVar);
    }

    private areh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", areg.class, "c", aref.class});
            case 3:
                return new areh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (areh.class) {
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
