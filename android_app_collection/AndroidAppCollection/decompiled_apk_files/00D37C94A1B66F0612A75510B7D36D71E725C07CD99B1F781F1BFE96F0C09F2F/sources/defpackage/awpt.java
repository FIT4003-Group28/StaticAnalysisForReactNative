package defpackage;
/* compiled from: PG */
/* renamed from: awpt  reason: default package */
/* loaded from: classes2.dex */
public final class awpt extends aopi implements aoqv {
    public static final awpt a;
    private static volatile aorb b;
    private int c;
    private awmt d;
    private aoux e;
    private byte f = 2;

    static {
        awpt awptVar = new awpt();
        a = awptVar;
        aopi.registerDefaultInstance(awpt.class, awptVar);
    }

    private awpt() {
        aopi.emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0002\u0004ᐉ\u0002\u0006ᐉ\u0004", new Object[]{"c", "d", "e"});
            case 3:
                return new awpt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpt.class) {
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
