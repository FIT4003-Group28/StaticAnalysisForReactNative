package defpackage;
/* compiled from: PG */
/* renamed from: apfp  reason: default package */
/* loaded from: classes.dex */
public final class apfp extends aopi implements aoqv {
    public static final apfp a;
    private static volatile aorb d;
    public int b;
    public atnv c;

    static {
        apfp apfpVar = new apfp();
        a = apfpVar;
        aopi.registerDefaultInstance(apfp.class, apfpVar);
    }

    private apfp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf166₴\uf166₴\u0001\u0000\u0000\u0000\uf166₴ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apfp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apfp.class) {
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
