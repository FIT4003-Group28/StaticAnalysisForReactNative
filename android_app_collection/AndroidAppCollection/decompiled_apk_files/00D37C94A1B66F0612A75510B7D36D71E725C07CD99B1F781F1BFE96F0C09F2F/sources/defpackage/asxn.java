package defpackage;
/* compiled from: PG */
/* renamed from: asxn  reason: default package */
/* loaded from: classes2.dex */
public final class asxn extends aopi implements aoqv {
    public static final asxn a;
    private static volatile aorb e;
    public int b;
    public float c;
    public aoqp d = aoqp.a;

    static {
        asxn asxnVar = new asxn();
        a = asxnVar;
        aopi.registerDefaultInstance(asxn.class, asxnVar);
    }

    private asxn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ခ\u0000\u00022", new Object[]{"b", "c", "d", asxm.a});
            case 3:
                return new asxn();
            case 4:
                return new aopa((byte[][][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asxn.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
