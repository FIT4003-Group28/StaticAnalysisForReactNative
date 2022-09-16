package defpackage;
/* compiled from: PG */
/* renamed from: appl  reason: default package */
/* loaded from: classes2.dex */
public final class appl extends aopi implements aoqv {
    private static final appl a;
    private static volatile aorb b;
    private int c;
    private int d;

    static {
        appl applVar = new appl();
        a = applVar;
        aopi.registerDefaultInstance(appl.class, applVar);
    }

    private appl() {
    }

    public static appl b() {
        return a;
    }

    public avfy c() {
        avfy b2 = avfy.b(this.d);
        return b2 == null ? avfy.SCREEN_UNKNOWN : b2;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", avfy.a()});
            case 3:
                return new appl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (appl.class) {
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
