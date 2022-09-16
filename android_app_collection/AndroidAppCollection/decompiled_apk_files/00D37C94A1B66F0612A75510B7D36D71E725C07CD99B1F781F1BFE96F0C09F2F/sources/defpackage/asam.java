package defpackage;
/* compiled from: PG */
/* renamed from: asam  reason: default package */
/* loaded from: classes2.dex */
public final class asam extends aopi implements aoqv {
    public static final asam a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        asam asamVar = new asam();
        a = asamVar;
        aopi.registerDefaultInstance(asam.class, asamVar);
    }

    private asam() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf4c9᪓\uf4b2ↂ\u0002\u0000\u0000\u0000\uf4c9᪓ြ\u0000\uf4b2ↂြ\u0000", new Object[]{"c", "b", aubx.class, aual.class});
            case 3:
                return new asam();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asam.class) {
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
