package defpackage;
/* compiled from: PG */
/* renamed from: aucc  reason: default package */
/* loaded from: classes2.dex */
public final class aucc extends aopi implements aoqv {
    public static final aopr a = new asvu(7);
    public static final aucc b;
    private static volatile aorb d;
    public aopq c = emptyIntList();

    static {
        aucc auccVar = new aucc();
        b = auccVar;
        aopi.registerDefaultInstance(aucc.class, auccVar);
    }

    private aucc() {
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"c", aucb.a()});
            case 3:
                return new aucc();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aucc.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
