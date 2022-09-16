package defpackage;
/* compiled from: PG */
/* renamed from: awah  reason: default package */
/* loaded from: classes2.dex */
public final class awah extends aopi implements aoqv {
    public static final awah a;
    private static volatile aorb b;
    private int c;
    private awai d;
    private byte e = 2;

    static {
        awah awahVar = new awah();
        a = awahVar;
        aopi.registerDefaultInstance(awah.class, awahVar);
    }

    private awah() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue2f3\u2437\ue2f3\u2437\u0001\u0000\u0000\u0001\ue2f3\u2437ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awah();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awah.class) {
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
