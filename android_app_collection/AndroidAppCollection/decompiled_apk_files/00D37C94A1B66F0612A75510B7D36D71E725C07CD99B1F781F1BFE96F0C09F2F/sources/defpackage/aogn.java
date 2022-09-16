package defpackage;
/* compiled from: PG */
/* renamed from: aogn  reason: default package */
/* loaded from: classes.dex */
public final class aogn extends aopi implements aoqv {
    public static final aogn a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public int c;
    private int e;

    static {
        aogn aognVar = new aogn();
        a = aognVar;
        aopi.registerDefaultInstance(aogn.class, aognVar);
    }

    private aogn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"e", "b", aogo.class, "c", anfo.o});
            case 3:
                return new aogn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aogn.class) {
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
