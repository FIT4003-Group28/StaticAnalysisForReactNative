package defpackage;
/* compiled from: PG */
/* renamed from: awof  reason: default package */
/* loaded from: classes2.dex */
public final class awof extends aopi implements aoqv {
    public static final awof a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public awmt d;
    public awmt e;
    public awmt f;
    public awmt g;
    private byte i = 2;

    static {
        awof awofVar = new awof();
        a = awofVar;
        aopi.registerDefaultInstance(awof.class, awofVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awofVar, awofVar, null, 170382629, aosj.MESSAGE, awof.class);
    }

    private awof() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new awof();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awof.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
