package defpackage;
/* compiled from: PG */
/* renamed from: awvu  reason: default package */
/* loaded from: classes2.dex */
public final class awvu extends aopi implements aoqv {
    public static final awvu a;
    private static volatile aorb d;
    public awvx b;
    public awvx c;
    private int e;
    private byte f = 2;

    static {
        awvu awvuVar = new awvu();
        a = awvuVar;
        aopi.registerDefaultInstance(awvu.class, awvuVar);
    }

    private awvu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new awvu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awvu.class) {
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
