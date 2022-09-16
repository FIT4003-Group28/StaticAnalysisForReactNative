package defpackage;
/* compiled from: PG */
/* renamed from: auak  reason: default package */
/* loaded from: classes2.dex */
public final class auak extends aopi implements aoqv {
    public static final auak a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private byte e = 2;

    static {
        auak auakVar = new auak();
        a = auakVar;
        aopi.registerDefaultInstance(auak.class, auakVar);
    }

    private auak() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\b", new Object[]{"c", "d"});
            case 3:
                return new auak();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auak.class) {
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
