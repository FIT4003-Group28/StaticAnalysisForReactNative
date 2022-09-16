package defpackage;
/* compiled from: PG */
/* renamed from: ardp  reason: default package */
/* loaded from: classes2.dex */
public final class ardp extends aopi implements aoqv {
    public static final ardp a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public apzg d;
    private aoux g;
    private arbf h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        ardp ardpVar = new ardp();
        a = ardpVar;
        aopi.registerDefaultInstance(ardp.class, ardpVar);
    }

    private ardp() {
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
                return new ardp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ardp.class) {
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
