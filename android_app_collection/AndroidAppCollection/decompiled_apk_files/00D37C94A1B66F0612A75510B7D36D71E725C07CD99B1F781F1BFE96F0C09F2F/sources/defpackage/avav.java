package defpackage;
/* compiled from: PG */
/* renamed from: avav  reason: default package */
/* loaded from: classes2.dex */
public final class avav extends aopi implements aoqv {
    public static final avav a;
    private static volatile aorb e;
    public long c;
    private int f;
    public String b = "";
    public aopu d = aopi.emptyProtobufList();

    static {
        avav avavVar = new avav();
        a = avavVar;
        aopi.registerDefaultInstance(avav.class, avavVar);
    }

    private avav() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဂ\u0001\u0003ဈ\u0000\u0004\u001a", new Object[]{"f", "c", "b", "d"});
            case 3:
                return new avav();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avav.class) {
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
