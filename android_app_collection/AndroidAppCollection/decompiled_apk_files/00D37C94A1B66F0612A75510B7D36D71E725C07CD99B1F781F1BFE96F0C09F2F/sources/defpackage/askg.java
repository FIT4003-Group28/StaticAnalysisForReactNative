package defpackage;
/* compiled from: PG */
/* renamed from: askg  reason: default package */
/* loaded from: classes2.dex */
public final class askg extends aopi implements aoqv {
    public static final askg a;
    private static volatile aorb d;
    public int b;
    public String c = "";
    private boolean e;

    static {
        askg askgVar = new askg();
        a = askgVar;
        aopi.registerDefaultInstance(askg.class, askgVar);
    }

    private askg() {
    }

    public static /* synthetic */ void a(askg askgVar) {
        askgVar.b |= 2;
        askgVar.e = true;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new askg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (askg.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
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
