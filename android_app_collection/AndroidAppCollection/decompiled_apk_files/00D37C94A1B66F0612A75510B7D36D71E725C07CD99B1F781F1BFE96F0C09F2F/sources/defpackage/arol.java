package defpackage;
/* compiled from: PG */
/* renamed from: arol  reason: default package */
/* loaded from: classes2.dex */
public final class arol extends aopi implements aoqv {
    public static final arol a;
    private static volatile aorb c;
    public arpa b;
    private int d;
    private ardv e;
    private apyy f;
    private arhd g;
    private byte h = 2;

    static {
        arol arolVar = new arol();
        a = arolVar;
        aopi.registerDefaultInstance(arol.class, arolVar);
    }

    private arol() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"d", "b", "e", "f", "g"});
            case 3:
                return new arol();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arol.class) {
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
