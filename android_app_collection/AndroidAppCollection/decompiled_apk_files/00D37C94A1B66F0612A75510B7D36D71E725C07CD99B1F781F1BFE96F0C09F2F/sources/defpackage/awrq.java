package defpackage;
/* compiled from: PG */
/* renamed from: awrq  reason: default package */
/* loaded from: classes2.dex */
public final class awrq extends aopi implements aoqv {
    public static final awrq a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public awmt d;
    public awmt e;
    private byte g = 2;

    static {
        awrq awrqVar = new awrq();
        a = awrqVar;
        aopi.registerDefaultInstance(awrq.class, awrqVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awrqVar, awrqVar, null, 323854738, aosj.MESSAGE, awrq.class);
    }

    private awrq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new awrq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awrq.class) {
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
