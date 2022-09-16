package defpackage;
/* compiled from: PG */
/* renamed from: aojt  reason: default package */
/* loaded from: classes.dex */
public final class aojt extends aopi implements aoqv {
    private static final aojt a;
    private static volatile aorb b;
    private int c;
    private int d;

    static {
        aojt aojtVar = new aojt();
        a = aojtVar;
        aopi.registerDefaultInstance(aojt.class, aojtVar);
    }

    private aojt() {
    }

    public static aojr a() {
        return (aojr) a.createBuilder();
    }

    public static /* synthetic */ void c(aojt aojtVar, aojs aojsVar) {
        aojtVar.d(aojsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(aojs aojsVar) {
        this.d = aojsVar.i;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", aojs.b()});
            case 3:
                return new aojt();
            case 4:
                return new aojr();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aojt.class) {
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
