package defpackage;
/* compiled from: PG */
/* renamed from: awsf  reason: default package */
/* loaded from: classes2.dex */
public final class awsf extends aopi implements aoqv {
    public static final awsf a;
    private static volatile aorb g;
    public Object c;
    public Object e;
    private int h;
    public int b = 0;
    public int d = 0;
    public String f = "";

    static {
        awsf awsfVar = new awsf();
        a = awsfVar;
        aopi.registerDefaultInstance(awsf.class, awsfVar);
    }

    private awsf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0001\u0005ြ\u0000", new Object[]{"c", "b", "e", "d", "h", "f", awry.class, awse.class, awry.class, awrx.class});
            case 3:
                return new awsf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awsf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
