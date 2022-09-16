package defpackage;
/* compiled from: PG */
/* renamed from: orb  reason: default package */
/* loaded from: classes4.dex */
public final class orb extends aopi implements aoqv {
    public static final orb a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        orb orbVar = new orb();
        a = orbVar;
        aopi.registerDefaultInstance(orb.class, orbVar);
    }

    private orb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", ora.class, "c", oqy.class});
            case 3:
                return new orb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (orb.class) {
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
