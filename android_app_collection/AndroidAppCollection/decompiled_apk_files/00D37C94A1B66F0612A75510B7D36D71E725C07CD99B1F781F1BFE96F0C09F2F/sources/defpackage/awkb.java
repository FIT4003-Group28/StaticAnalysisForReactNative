package defpackage;
/* compiled from: PG */
/* renamed from: awkb  reason: default package */
/* loaded from: classes2.dex */
public final class awkb extends aopi implements aoqv {
    public static final awkb a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        awkb awkbVar = new awkb();
        a = awkbVar;
        aopi.registerDefaultInstance(awkb.class, awkbVar);
    }

    private awkb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"c", "b"});
            case 3:
                return new awkb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awkb.class) {
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
