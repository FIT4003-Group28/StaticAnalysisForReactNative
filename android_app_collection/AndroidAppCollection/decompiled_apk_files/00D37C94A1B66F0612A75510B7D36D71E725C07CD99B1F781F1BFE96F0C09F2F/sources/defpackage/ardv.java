package defpackage;
/* compiled from: PG */
/* renamed from: ardv  reason: default package */
/* loaded from: classes2.dex */
public final class ardv extends aopi implements aoqv {
    public static final ardv a;
    private static volatile aorb b;
    private int c;
    private avtk d;
    private avwl e;
    private byte f = 2;

    static {
        ardv ardvVar = new ardv();
        a = ardvVar;
        aopi.registerDefaultInstance(ardv.class, ardvVar);
    }

    private ardv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001︿Ḗ\ue70c㔱\u0002\u0000\u0000\u0002︿Ḗᐉ\u0001\ue70c㔱ᐉ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new ardv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ardv.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
