package defpackage;
/* compiled from: PG */
/* renamed from: ardl  reason: default package */
/* loaded from: classes2.dex */
public final class ardl extends aopi implements aoqv {
    public static final ardl a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public apzg d;
    private aoux g;
    private arbf h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        ardl ardlVar = new ardl();
        a = ardlVar;
        aopi.registerDefaultInstance(ardl.class, ardlVar);
    }

    private ardl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "g", "e", "h"});
            case 3:
                return new ardl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ardl.class) {
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
