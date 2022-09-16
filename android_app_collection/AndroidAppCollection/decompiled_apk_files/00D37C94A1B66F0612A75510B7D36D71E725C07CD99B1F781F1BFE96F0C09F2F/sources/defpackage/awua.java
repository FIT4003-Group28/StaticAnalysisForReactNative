package defpackage;
/* compiled from: PG */
/* renamed from: awua  reason: default package */
/* loaded from: classes2.dex */
public final class awua extends aopi implements aoqv {
    public static final awua a;
    private static volatile aorb f;
    public int b;
    public long c;
    public aopu d = aopi.emptyProtobufList();
    public aopu e = aopi.emptyProtobufList();

    static {
        awua awuaVar = new awua();
        a = awuaVar;
        aopi.registerDefaultInstance(awua.class, awuaVar);
    }

    private awua() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0002\u0000\u0001ဂ\u0000\u0003\u001a\u0005\u001a", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awua();
            case 4:
                return new aopa((boolean[][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awua.class) {
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
