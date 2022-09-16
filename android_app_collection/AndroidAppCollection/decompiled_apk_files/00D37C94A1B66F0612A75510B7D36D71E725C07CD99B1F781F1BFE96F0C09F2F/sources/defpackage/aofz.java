package defpackage;
/* compiled from: PG */
/* renamed from: aofz  reason: default package */
/* loaded from: classes.dex */
public final class aofz extends aopi implements aoqv {
    public static final aofz a;
    private static volatile aorb d;
    public aopu b = aopi.emptyProtobufList();
    public aopu c = aopi.emptyProtobufList();

    static {
        aofz aofzVar = new aofz();
        a = aofzVar;
        aopi.registerDefaultInstance(aofz.class, aofzVar);
    }

    private aofz() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0003\u0006\u0002\u0000\u0002\u0000\u0003Ț\u0006Ț", new Object[]{"b", "c"});
            case 3:
                return new aofz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aofz.class) {
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
