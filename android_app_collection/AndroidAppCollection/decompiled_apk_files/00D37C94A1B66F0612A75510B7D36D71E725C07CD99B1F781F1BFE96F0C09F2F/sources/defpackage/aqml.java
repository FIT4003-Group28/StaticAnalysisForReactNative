package defpackage;
/* compiled from: PG */
/* renamed from: aqml  reason: default package */
/* loaded from: classes2.dex */
public final class aqml extends aopi implements aoqv {
    public static final aqml a;
    private static volatile aorb c;
    public int b = 0;
    private Object d;

    static {
        aqml aqmlVar = new aqml();
        a = aqmlVar;
        aopi.registerDefaultInstance(aqml.class, aqmlVar);
    }

    private aqml() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"d", "b", aveg.class});
            case 3:
                return new aqml();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqml.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
