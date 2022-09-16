package defpackage;
/* compiled from: PG */
/* renamed from: ammq  reason: default package */
/* loaded from: classes.dex */
public final class ammq extends aopi implements aoqv {
    public static final ammq a;
    private static volatile aorb j;
    public int b;
    public long c;
    public long d;
    public aopu e = emptyProtobufList();
    public long f;
    public long g;
    public amku h;
    public int i;

    static {
        ammq ammqVar = new ammq();
        a = ammqVar;
        aopi.registerDefaultInstance(ammq.class, ammqVar);
    }

    private ammq() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\nဉ\u0004\u000bဌ\u0005", new Object[]{"b", "c", "d", "e", amlo.class, "f", "g", "h", "i", ammp.b()});
            case 3:
                return new ammq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (ammq.class) {
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
