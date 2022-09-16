package defpackage;
/* compiled from: PG */
/* renamed from: asdy  reason: default package */
/* loaded from: classes2.dex */
public final class asdy extends aopi implements aoqv {
    public static final asdy a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asdy asdyVar = new asdy();
        a = asdyVar;
        aopi.registerDefaultInstance(asdy.class, asdyVar);
    }

    private asdy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf8bf⦅\uf8bf⦅\u0001\u0000\u0000\u0001\uf8bf⦅ᐼ\u0000", new Object[]{"c", "b", asec.class});
            case 3:
                return new asdy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asdy.class) {
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
