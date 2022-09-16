package defpackage;
/* compiled from: PG */
/* renamed from: arlp  reason: default package */
/* loaded from: classes2.dex */
public final class arlp extends aopi implements aoqv {
    public static final arlp a;
    private static volatile aorb b;
    private int c;
    private atah d;
    private avzn e;
    private avzo f;
    private apmx g;
    private byte h = 2;

    static {
        arlp arlpVar = new arlp();
        a = arlpVar;
        aopi.registerDefaultInstance(arlp.class, arlpVar);
    }

    private arlp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf38eឮ\ue35b僂\u0004\u0000\u0000\u0004\uf38eឮᐉ\u0000\uf66aឮᐉ\u0001\ue887㩾ᐉ\u0003\ue35b僂ᐉ\u0002", new Object[]{"c", "d", "e", "g", "f"});
            case 3:
                return new arlp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arlp.class) {
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
