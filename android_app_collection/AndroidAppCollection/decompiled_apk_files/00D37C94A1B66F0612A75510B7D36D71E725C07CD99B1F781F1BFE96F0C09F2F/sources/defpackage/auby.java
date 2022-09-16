package defpackage;
/* compiled from: PG */
/* renamed from: auby  reason: default package */
/* loaded from: classes2.dex */
public final class auby extends aopi implements aoqv {
    public static final auby a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        auby aubyVar = new auby();
        a = aubyVar;
        aopi.registerDefaultInstance(auby.class, aubyVar);
    }

    private auby() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဋ\u0001", new Object[]{"d", "b"});
            case 3:
                return new auby();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auby.class) {
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
