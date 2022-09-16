package defpackage;
/* compiled from: PG */
/* renamed from: axgs  reason: default package */
/* loaded from: classes2.dex */
public final class axgs extends aopi implements aoqv {
    public static final axgs a;
    private static volatile aorb j;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;

    static {
        axgs axgsVar = new axgs();
        a = axgsVar;
        aopi.registerDefaultInstance(axgs.class, axgsVar);
    }

    private axgs() {
    }

    public static /* synthetic */ void a(axgs axgsVar) {
        axgsVar.b |= 128;
        axgsVar.h = 350000000L;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003\t\u0007\u0000\u0000\u0000\u0003ဌ\u0000\u0004ဈ\u0001\u0005ဌ\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007\tင\b", new Object[]{"b", "c", axgq.a(), "d", "e", axgp.a(), "f", "g", "h", "i"});
            case 3:
                return new axgs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (axgs.class) {
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
