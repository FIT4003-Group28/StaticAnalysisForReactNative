package defpackage;
/* compiled from: PG */
/* renamed from: asky  reason: default package */
/* loaded from: classes2.dex */
public final class asky extends aopi implements aoqv {
    public static final asky a;
    private static volatile aorb g;
    public int b;
    public int c;
    public aoob d = aoob.b;
    public String e = "";
    public askx f;

    static {
        asky askyVar = new asky();
        a = askyVar;
        aopi.registerDefaultInstance(asky.class, askyVar);
    }

    private asky() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\ue8e8乿\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\ue8e8乿ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asky();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asky.class) {
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
