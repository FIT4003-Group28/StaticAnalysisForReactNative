package defpackage;
/* compiled from: PG */
/* renamed from: apfy  reason: default package */
/* loaded from: classes.dex */
public final class apfy extends aopi implements aoqv {
    public static final apfy a;
    private static volatile aorb d;
    public int b;
    public boolean c;

    static {
        apfy apfyVar = new apfy();
        a = apfyVar;
        aopi.registerDefaultInstance(apfy.class, apfyVar);
    }

    private apfy() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apfy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apfy.class) {
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
