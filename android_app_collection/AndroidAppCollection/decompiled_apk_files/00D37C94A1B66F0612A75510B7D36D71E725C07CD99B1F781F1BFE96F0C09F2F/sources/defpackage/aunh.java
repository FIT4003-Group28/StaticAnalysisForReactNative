package defpackage;
/* compiled from: PG */
/* renamed from: aunh  reason: default package */
/* loaded from: classes2.dex */
public final class aunh extends aopi implements aoqv {
    public static final aunh a;
    private static volatile aorb d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        aunh aunhVar = new aunh();
        a = aunhVar;
        aopi.registerDefaultInstance(aunh.class, aunhVar);
    }

    private aunh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\r\u001f\u0002\u0000\u0000\u0000\rဇ\n\u001fဇ\u001a", new Object[]{"e", "b", "c"});
            case 3:
                return new aunh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aunh.class) {
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
