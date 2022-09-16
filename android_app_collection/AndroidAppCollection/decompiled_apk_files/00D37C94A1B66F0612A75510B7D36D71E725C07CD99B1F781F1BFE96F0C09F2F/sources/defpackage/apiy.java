package defpackage;
/* compiled from: PG */
/* renamed from: apiy  reason: default package */
/* loaded from: classes.dex */
public final class apiy extends aopi implements aoqv {
    public static final apiy a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public aunb d;
    public int e;
    private byte g = 2;

    static {
        apiy apiyVar = new apiy();
        a = apiyVar;
        aopi.registerDefaultInstance(apiy.class, apiyVar);
    }

    private apiy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", apiv.c});
            case 3:
                return new apiy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apiy.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
