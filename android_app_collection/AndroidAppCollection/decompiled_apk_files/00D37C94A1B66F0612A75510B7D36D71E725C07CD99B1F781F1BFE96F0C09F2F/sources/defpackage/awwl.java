package defpackage;
/* compiled from: PG */
/* renamed from: awwl  reason: default package */
/* loaded from: classes2.dex */
public final class awwl extends aopd implements aope {
    public static final awwl a;
    private static volatile aorb b;
    private aoqp c = aoqp.a;
    private byte d = 2;

    static {
        awwl awwlVar = new awwl();
        a = awwlVar;
        aopi.registerDefaultInstance(awwl.class, awwlVar);
    }

    private awwl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"c", awwk.a});
            case 3:
                return new awwl();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awwl.class) {
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
