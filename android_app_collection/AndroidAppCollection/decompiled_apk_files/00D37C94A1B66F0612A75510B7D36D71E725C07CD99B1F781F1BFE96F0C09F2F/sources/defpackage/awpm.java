package defpackage;
/* compiled from: PG */
/* renamed from: awpm  reason: default package */
/* loaded from: classes2.dex */
public final class awpm extends aopi implements aoqv {
    public static final awpm a;
    private static volatile aorb b;
    private int c;
    private awmt d;
    private awmt e;
    private awmt f;
    private awmt g;
    private awmt h;
    private byte i = 2;

    static {
        awpm awpmVar = new awpm();
        a = awpmVar;
        aopi.registerDefaultInstance(awpm.class, awpmVar);
    }

    private awpm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new awpm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpm.class) {
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
