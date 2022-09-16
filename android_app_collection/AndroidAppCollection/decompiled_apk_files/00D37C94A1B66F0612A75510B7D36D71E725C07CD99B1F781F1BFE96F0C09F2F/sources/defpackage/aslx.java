package defpackage;
/* compiled from: PG */
/* renamed from: aslx  reason: default package */
/* loaded from: classes2.dex */
public final class aslx extends aopi implements aoqv {
    public static final aslx a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aoob d = aoob.b;
    public aopu e = aopi.emptyProtobufList();
    public long f;

    static {
        aslx aslxVar = new aslx();
        a = aslxVar;
        aopi.registerDefaultInstance(aslx.class, aslxVar);
    }

    private aslx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001a\u0005ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aslx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aslx.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
