package defpackage;
/* compiled from: PG */
/* renamed from: atyb  reason: default package */
/* loaded from: classes2.dex */
public final class atyb extends aopi implements aoqv {
    private static final aopr a = new asvu(6);
    private static final atyb b;
    private static volatile aorb c;
    private aopq d = emptyIntList();

    static {
        atyb atybVar = new atyb();
        b = atybVar;
        aopi.registerDefaultInstance(atyb.class, atybVar);
    }

    private atyb() {
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
                return newMessageInfo(b, "\u0001\u0000", null);
            case 3:
                return new atyb();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atyb.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
