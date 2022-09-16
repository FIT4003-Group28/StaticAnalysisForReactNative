package defpackage;
/* compiled from: PG */
/* renamed from: aqni  reason: default package */
/* loaded from: classes2.dex */
public final class aqni extends aopi implements aoqv {
    public static final aqni a;
    private static volatile aorb b;
    private int c;
    private boolean d;

    static {
        aqni aqniVar = new aqni();
        a = aqniVar;
        aopi.registerDefaultInstance(aqni.class, aqniVar);
    }

    private aqni() {
    }

    public static /* synthetic */ void a(aqni aqniVar) {
        aqniVar.c |= 1;
        aqniVar.d = true;
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
                return new aqni();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqni.class) {
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
