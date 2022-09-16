package defpackage;
/* compiled from: PG */
/* renamed from: avcf  reason: default package */
/* loaded from: classes2.dex */
public final class avcf extends aopi implements aoqv {
    public static final avcf a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public boolean d;
    private int f;

    static {
        avcf avcfVar = new avcf();
        a = avcfVar;
        aopi.registerDefaultInstance(avcf.class, avcfVar);
        b = aopi.newSingularGeneratedExtension(avcj.a, avcfVar, avcfVar, null, 322606150, aosj.MESSAGE, avcf.class);
    }

    private avcf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new avcf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avcf.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
