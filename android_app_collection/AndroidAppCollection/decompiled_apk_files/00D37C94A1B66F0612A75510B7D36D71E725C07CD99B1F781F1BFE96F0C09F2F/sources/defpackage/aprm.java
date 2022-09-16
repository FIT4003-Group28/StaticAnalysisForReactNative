package defpackage;
/* compiled from: PG */
/* renamed from: aprm  reason: default package */
/* loaded from: classes2.dex */
public final class aprm extends aopi implements aoqv {
    public static final aprm a;
    private static volatile aorb f;
    public int b;
    public aprs c;
    public aprp d;
    public aprq e;
    private byte g = 2;

    static {
        aprm aprmVar = new aprm();
        a = aprmVar;
        aopi.registerDefaultInstance(aprm.class, aprmVar);
    }

    private aprm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uec7d⏫\uf4fb\u2b98\u0003\u0000\u0000\u0003\uec7d⏫ᐉ\u0000\uf2a2⤛ᐉ\u0001\uf4fb\u2b98ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aprm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aprm.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
