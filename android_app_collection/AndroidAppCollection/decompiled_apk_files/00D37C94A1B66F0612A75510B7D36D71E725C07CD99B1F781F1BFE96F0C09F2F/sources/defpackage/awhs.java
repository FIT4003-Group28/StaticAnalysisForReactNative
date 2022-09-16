package defpackage;
/* compiled from: PG */
/* renamed from: awhs  reason: default package */
/* loaded from: classes2.dex */
public final class awhs extends aopi implements aoqv {
    public static final awhs a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private apzg e;
    private byte f = 2;

    static {
        awhs awhsVar = new awhs();
        a = awhsVar;
        aopi.registerDefaultInstance(awhs.class, awhsVar);
    }

    private awhs() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0007\u0002\u0000\u0000\u0002\u0003ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"c", "d", "e"});
            case 3:
                return new awhs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awhs.class) {
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
