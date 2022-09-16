package defpackage;
/* compiled from: PG */
/* renamed from: aokm  reason: default package */
/* loaded from: classes.dex */
public final class aokm extends aopi implements aoqv {
    public static final aokm a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public aomr d;
    public aokc e;

    static {
        aokm aokmVar = new aokm();
        a = aokmVar;
        aopi.registerDefaultInstance(aokm.class, aokmVar);
    }

    private aokm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", aolq.class, "d", "e"});
            case 3:
                return new aokm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aokm.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
