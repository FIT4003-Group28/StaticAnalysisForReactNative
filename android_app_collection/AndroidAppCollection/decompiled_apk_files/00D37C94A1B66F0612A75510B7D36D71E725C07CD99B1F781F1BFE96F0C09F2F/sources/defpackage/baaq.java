package defpackage;
/* compiled from: PG */
/* renamed from: baaq  reason: default package */
/* loaded from: classes2.dex */
public final class baaq extends aopi implements aoqv {
    public static final baaq a;
    private static volatile aorb l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public aopu k = emptyProtobufList();

    static {
        baaq baaqVar = new baaq();
        a = baaqVar;
        aopi.registerDefaultInstance(baaq.class, baaqVar);
    }

    private baaq() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", baap.class});
            case 3:
                return new baaq();
            case 4:
                return new aopa((float[][][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (baaq.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
