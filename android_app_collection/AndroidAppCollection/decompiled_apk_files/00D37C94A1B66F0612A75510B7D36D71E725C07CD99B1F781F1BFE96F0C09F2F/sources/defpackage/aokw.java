package defpackage;
/* compiled from: PG */
/* renamed from: aokw  reason: default package */
/* loaded from: classes.dex */
public final class aokw extends aopi implements aoqv {
    public static final aokw a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public long c;
    private int e;

    static {
        aokw aokwVar = new aokw();
        a = aokwVar;
        aopi.registerDefaultInstance(aokw.class, aokwVar);
    }

    private aokw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"e", "c", "b", aomd.class});
            case 3:
                return new aokw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aokw.class) {
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
