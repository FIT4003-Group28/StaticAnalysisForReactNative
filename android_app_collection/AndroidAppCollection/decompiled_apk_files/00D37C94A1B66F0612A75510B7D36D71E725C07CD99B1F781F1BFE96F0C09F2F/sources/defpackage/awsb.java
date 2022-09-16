package defpackage;
/* compiled from: PG */
/* renamed from: awsb  reason: default package */
/* loaded from: classes2.dex */
public final class awsb extends aopi implements aoqv {
    public static final awsb a;
    private static volatile aorb h;
    public int b;
    public aopl c = emptyDoubleList();
    public aopl d = emptyDoubleList();
    public awsc e;
    public awsf f;
    public awsh g;

    static {
        awsb awsbVar = new awsb();
        a = awsbVar;
        aopi.registerDefaultInstance(awsb.class, awsbVar);
    }

    private awsb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u0012\u0002\u0012\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new awsb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awsb.class) {
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
