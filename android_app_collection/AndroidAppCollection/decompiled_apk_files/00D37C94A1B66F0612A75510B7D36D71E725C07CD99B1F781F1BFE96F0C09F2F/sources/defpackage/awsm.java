package defpackage;
/* compiled from: PG */
/* renamed from: awsm  reason: default package */
/* loaded from: classes2.dex */
public final class awsm extends aopi implements aoqv {
    public static final awsm a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public awmt d;
    public awmt e;
    private awmt g;
    private byte h = 2;

    static {
        awsm awsmVar = new awsm();
        a = awsmVar;
        aopi.registerDefaultInstance(awsm.class, awsmVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awsmVar, awsmVar, null, 217374632, aosj.MESSAGE, awsm.class);
    }

    private awsm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"c", "d", "e", "g"});
            case 3:
                return new awsm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awsm.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
