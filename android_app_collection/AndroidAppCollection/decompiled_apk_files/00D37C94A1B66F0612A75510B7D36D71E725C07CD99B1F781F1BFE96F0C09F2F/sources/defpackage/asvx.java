package defpackage;
/* compiled from: PG */
/* renamed from: asvx  reason: default package */
/* loaded from: classes2.dex */
public final class asvx extends aopi implements aoqv {
    public static final asvx a;
    private static volatile aorb g;
    public int b;
    public aski c;
    public aqju d;
    public asvw e;
    public apvo f;

    static {
        asvx asvxVar = new asvx();
        a = asvxVar;
        aopi.registerDefaultInstance(asvx.class, asvxVar);
    }

    private asvx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asvx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asvx.class) {
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
