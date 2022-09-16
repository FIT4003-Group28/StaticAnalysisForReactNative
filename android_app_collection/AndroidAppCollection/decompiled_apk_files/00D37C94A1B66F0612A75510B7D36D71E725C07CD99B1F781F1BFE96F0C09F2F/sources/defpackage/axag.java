package defpackage;
/* compiled from: PG */
/* renamed from: axag */
/* loaded from: classes2.dex */
public final class axag extends aopi implements aoqv {
    private static final axag a;
    private static volatile aorb b;
    private int c;
    private long d;

    static {
        axag axagVar = new axag();
        a = axagVar;
        aopi.registerDefaultInstance(axag.class, axagVar);
    }

    private axag() {
    }

    public static axaf a() {
        return (axaf) a.createBuilder();
    }

    public static /* synthetic */ axag b() {
        return a;
    }

    public void d(long j) {
        this.c |= 1;
        this.d = j;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "d"});
            case 3:
                return new axag();
            case 4:
                return new axaf();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axag.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
