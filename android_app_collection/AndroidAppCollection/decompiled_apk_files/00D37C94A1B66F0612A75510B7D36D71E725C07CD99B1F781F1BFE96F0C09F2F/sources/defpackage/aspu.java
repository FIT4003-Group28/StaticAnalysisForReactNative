package defpackage;
/* compiled from: PG */
/* renamed from: aspu  reason: default package */
/* loaded from: classes2.dex */
public final class aspu extends aopi implements aoqv {
    private static final aspu a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;

    static {
        aspu aspuVar = new aspu();
        a = aspuVar;
        aopi.registerDefaultInstance(aspu.class, aspuVar);
    }

    private aspu() {
    }

    public static aspt a() {
        return (aspt) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(aspv aspvVar) {
        this.e = aspvVar.e;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(aspw aspwVar) {
        this.d = aspwVar.g;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", aspw.a(), "e", aspv.a()});
            case 3:
                return new aspu();
            case 4:
                return new aspt();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aspu.class) {
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
