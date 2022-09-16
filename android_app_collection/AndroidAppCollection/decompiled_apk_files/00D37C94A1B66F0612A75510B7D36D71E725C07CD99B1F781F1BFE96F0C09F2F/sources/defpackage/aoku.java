package defpackage;
/* compiled from: PG */
/* renamed from: aoku  reason: default package */
/* loaded from: classes.dex */
public final class aoku extends aopi implements aoqv {
    public static final aoku a;
    private static volatile aorb e;
    public aopu b = emptyProtobufList();
    public long c;
    public long d;
    private int f;

    static {
        aoku aokuVar = new aoku();
        a = aokuVar;
        aopi.registerDefaultInstance(aoku.class, aokuVar);
    }

    private aoku() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004ဂ\u0000\u0005ဂ\u0001\u0007\u001b", new Object[]{"f", "c", "d", "b", aomd.class});
            case 3:
                return new aoku();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoku.class) {
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
