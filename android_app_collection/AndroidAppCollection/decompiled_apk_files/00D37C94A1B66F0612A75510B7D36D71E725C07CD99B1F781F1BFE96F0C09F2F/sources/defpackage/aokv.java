package defpackage;
/* compiled from: PG */
/* renamed from: aokv  reason: default package */
/* loaded from: classes.dex */
public final class aokv extends aopi implements aoqv {
    public static final aokv a;
    private static volatile aorb k;
    public int b;
    public aolp d;
    public long e;
    public int f;
    public aolm g;
    public int h;
    public aomk j;
    public String c = "";
    public aopu i = emptyProtobufList();

    static {
        aokv aokvVar = new aokv();
        a = aokvVar;
        aopi.registerDefaultInstance(aokv.class, aokvVar);
    }

    private aokv() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001ဈ\u0000\u0005ဌ\u0004\u0007ဂ\u0002\bဉ\u0001\tဉ\u0005\n\u001b\u000bဌ\u0006\fဉ\u0007", new Object[]{"b", "c", "f", aoix.u, "e", "d", "g", "i", aolq.class, "h", aomb.b(), "j"});
            case 3:
                return new aokv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aokv.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
