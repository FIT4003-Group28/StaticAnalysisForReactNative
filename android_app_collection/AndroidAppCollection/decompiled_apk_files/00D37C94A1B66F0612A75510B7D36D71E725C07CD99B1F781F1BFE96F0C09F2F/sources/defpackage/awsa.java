package defpackage;
/* compiled from: PG */
/* renamed from: awsa  reason: default package */
/* loaded from: classes2.dex */
public final class awsa extends aopi implements aoqv {
    public static final awsa a;
    private static volatile aorb f;
    public aopu b = emptyProtobufList();
    public awrs c;
    public awrz d;
    public awsd e;
    private int g;

    static {
        awsa awsaVar = new awsa();
        a = awsaVar;
        aopi.registerDefaultInstance(awsa.class, awsaVar);
    }

    private awsa() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"g", "b", awsb.class, "c", "d", "e"});
            case 3:
                return new awsa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awsa.class) {
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
