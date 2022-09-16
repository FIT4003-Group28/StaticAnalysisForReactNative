package defpackage;
/* compiled from: PG */
/* renamed from: awcr  reason: default package */
/* loaded from: classes2.dex */
public final class awcr extends aopi implements aoqv {
    public static final awcr a;
    private static volatile aorb b;
    private byte c = 2;

    static {
        awcr awcrVar = new awcr();
        a = awcrVar;
        aopi.registerDefaultInstance(awcr.class, awcrVar);
    }

    private awcr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new awcr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awcr.class) {
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
