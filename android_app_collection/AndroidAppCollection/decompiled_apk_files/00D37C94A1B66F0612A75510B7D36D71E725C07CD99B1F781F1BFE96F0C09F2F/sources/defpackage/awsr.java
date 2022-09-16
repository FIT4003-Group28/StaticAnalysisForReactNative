package defpackage;
/* compiled from: PG */
/* renamed from: awsr  reason: default package */
/* loaded from: classes2.dex */
public final class awsr extends aopi implements aoqv {
    public static final awsr a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public awnn d;
    public int e;
    public double f;
    public int g;
    public boolean h;
    public int i;
    private byte k = 2;

    static {
        awsr awsrVar = new awsr();
        a = awsrVar;
        aopi.registerDefaultInstance(awsr.class, awsrVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awsrVar, awsrVar, null, 220544256, aosj.MESSAGE, awsr.class);
    }

    private awsr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0004က\u0003\u0006ဌ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"c", "d", "e", awsi.a, "f", "g", awsi.c, "h", "i"});
            case 3:
                return new awsr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (awsr.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
