package defpackage;
/* compiled from: PG */
/* renamed from: aqoe  reason: default package */
/* loaded from: classes2.dex */
public final class aqoe extends aopi implements aoqv {
    private static final aqoe a;
    private static volatile aorb b;
    private int c;
    private boolean d;

    static {
        aqoe aqoeVar = new aqoe();
        a = aqoeVar;
        aopi.registerDefaultInstance(aqoe.class, aqoeVar);
    }

    private aqoe() {
    }

    public static aqod a() {
        return (aqod) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.c |= 1;
        this.d = z;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqoe();
            case 4:
                return new aqod();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqoe.class) {
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
