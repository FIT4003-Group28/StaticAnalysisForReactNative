package defpackage;
/* compiled from: PG */
/* renamed from: ativ  reason: default package */
/* loaded from: classes2.dex */
public final class ativ extends aopi implements aoqv {
    public static final ativ a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ativ ativVar = new ativ();
        a = ativVar;
        aopi.registerDefaultInstance(ativ.class, ativVar);
    }

    private ativ() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue9beⓏ\uf723鴎\u0004\u0000\u0000\u0004\ue9beⓏᐼ\u0000\uecd4㬓ᐼ\u0000謁腏ᐼ\u0000\uf723鴎ᐼ\u0000", new Object[]{"c", "b", aoxh.class, atjd.class, apre.class, aqyx.class});
            case 3:
                return new ativ();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ativ.class) {
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
