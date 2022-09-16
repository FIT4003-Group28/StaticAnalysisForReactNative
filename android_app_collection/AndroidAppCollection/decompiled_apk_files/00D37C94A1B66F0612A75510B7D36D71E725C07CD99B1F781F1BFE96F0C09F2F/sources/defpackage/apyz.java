package defpackage;
/* compiled from: PG */
/* renamed from: apyz  reason: default package */
/* loaded from: classes2.dex */
public final class apyz extends aopi implements aoqv {
    public static final apyz a;
    private static volatile aorb d;
    public aunb b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        apyz apyzVar = new apyz();
        a = apyzVar;
        aopi.registerDefaultInstance(apyz.class, apyzVar);
    }

    private apyz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဌ\u0001\u0003ᐉ\u0000", new Object[]{"e", "c", aoxm.e, "b"});
            case 3:
                return new apyz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apyz.class) {
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
