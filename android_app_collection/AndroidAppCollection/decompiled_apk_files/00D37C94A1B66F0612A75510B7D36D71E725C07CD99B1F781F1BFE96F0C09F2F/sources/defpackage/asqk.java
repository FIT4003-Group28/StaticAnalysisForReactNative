package defpackage;
/* compiled from: PG */
/* renamed from: asqk  reason: default package */
/* loaded from: classes2.dex */
public final class asqk extends aopi implements aoqv {
    public static final asqk a;
    private static volatile aorb d;
    public int b;
    public long c;

    static {
        asqk asqkVar = new asqk();
        a = asqkVar;
        aopi.registerDefaultInstance(asqk.class, asqkVar);
    }

    private asqk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဃ\u0001", new Object[]{"b", "c"});
            case 3:
                return new asqk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asqk.class) {
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
