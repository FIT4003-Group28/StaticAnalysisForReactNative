package defpackage;
/* compiled from: PG */
/* renamed from: apnj  reason: default package */
/* loaded from: classes.dex */
public final class apnj extends aopi implements aoqv {
    public static final apnj a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        apnj apnjVar = new apnj();
        a = apnjVar;
        aopi.registerDefaultInstance(apnj.class, apnjVar);
    }

    private apnj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", apiv.r});
            case 3:
                return new apnj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apnj.class) {
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
