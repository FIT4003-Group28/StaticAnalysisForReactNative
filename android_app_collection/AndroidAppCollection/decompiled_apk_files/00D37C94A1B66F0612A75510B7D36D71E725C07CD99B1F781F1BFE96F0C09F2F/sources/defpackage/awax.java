package defpackage;
/* compiled from: PG */
/* renamed from: awax  reason: default package */
/* loaded from: classes2.dex */
public final class awax extends aopi implements aoqv {
    public static final awax a;
    private static volatile aorb b;
    private int c;
    private atfo d;
    private byte e = 2;

    static {
        awax awaxVar = new awax();
        a = awaxVar;
        aopi.registerDefaultInstance(awax.class, awaxVar);
    }

    private awax() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue5b3⇼\ue5b3⇼\u0001\u0000\u0000\u0001\ue5b3⇼ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awax();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awax.class) {
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
