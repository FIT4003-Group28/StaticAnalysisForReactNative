package defpackage;
/* compiled from: PG */
/* renamed from: amoe  reason: default package */
/* loaded from: classes.dex */
public final class amoe extends aopi implements aoqv {
    private static final amoe a;
    private static volatile aorb b;
    private int c;
    private int d;
    private long e;

    static {
        amoe amoeVar = new amoe();
        a = amoeVar;
        aopi.registerDefaultInstance(amoe.class, amoeVar);
    }

    private amoe() {
    }

    public static amoc a() {
        return (amoc) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        this.c |= 2;
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(amod amodVar) {
        this.d = amodVar.p;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", amod.b(), "e"});
            case 3:
                return new amoe();
            case 4:
                return new amoc();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (amoe.class) {
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
