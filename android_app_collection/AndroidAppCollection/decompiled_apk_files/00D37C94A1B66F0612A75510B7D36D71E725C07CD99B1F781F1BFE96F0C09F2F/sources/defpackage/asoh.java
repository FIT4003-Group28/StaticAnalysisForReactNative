package defpackage;
/* compiled from: PG */
/* renamed from: asoh  reason: default package */
/* loaded from: classes2.dex */
public final class asoh extends aopi implements aoqv {
    private static final asoh a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;

    static {
        asoh asohVar = new asoh();
        a = asohVar;
        aopi.registerDefaultInstance(asoh.class, asohVar);
    }

    private asoh() {
    }

    public static asog a() {
        return (asog) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        this.c |= 2;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(asoi asoiVar) {
        this.d = asoiVar.j;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"c", "d", asoi.a(), "e"});
            case 3:
                return new asoh();
            case 4:
                return new asog();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asoh.class) {
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
