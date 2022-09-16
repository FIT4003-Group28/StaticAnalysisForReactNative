package defpackage;
/* compiled from: PG */
/* renamed from: aolc  reason: default package */
/* loaded from: classes.dex */
public final class aolc extends aopi implements aoqv {
    public static final aolc a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public long d;

    static {
        aolc aolcVar = new aolc();
        a = aolcVar;
        aopi.registerDefaultInstance(aolc.class, aolcVar);
    }

    private aolc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ဈ\u0002\u0007ဂ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new aolc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aolc.class) {
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
