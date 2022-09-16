package defpackage;
/* compiled from: PG */
/* renamed from: aeao  reason: default package */
/* loaded from: classes.dex */
public final class aeao extends aopi implements aoqv {
    public static final aeao a;
    private static volatile aorb b;

    static {
        aeao aeaoVar = new aeao();
        a = aeaoVar;
        aopi.registerDefaultInstance(aeao.class, aeaoVar);
    }

    private aeao() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aeao();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aeao.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
