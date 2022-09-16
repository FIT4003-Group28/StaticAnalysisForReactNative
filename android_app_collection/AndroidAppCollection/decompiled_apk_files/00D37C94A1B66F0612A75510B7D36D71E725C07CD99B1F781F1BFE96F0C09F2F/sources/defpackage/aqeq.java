package defpackage;
/* compiled from: PG */
/* renamed from: aqeq  reason: default package */
/* loaded from: classes2.dex */
public final class aqeq extends aopi implements aoqv {
    public static final aqeq a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public int d;

    static {
        aqeq aqeqVar = new aqeq();
        a = aqeqVar;
        aopi.registerDefaultInstance(aqeq.class, aqeqVar);
    }

    private aqeq() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003င\u0000", new Object[]{"b", "c", aqes.class, "d"});
            case 3:
                return new aqeq();
            case 4:
                return new aopa((short[]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqeq.class) {
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
