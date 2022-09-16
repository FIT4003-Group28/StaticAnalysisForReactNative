package defpackage;
/* compiled from: PG */
/* renamed from: uio  reason: default package */
/* loaded from: classes4.dex */
public final class uio extends aopi implements aoqv {
    public static final uio a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        uio uioVar = new uio();
        a = uioVar;
        aopi.registerDefaultInstance(uio.class, uioVar);
    }

    private uio() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aono.class});
            case 3:
                return new uio();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (uio.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
