package defpackage;
/* compiled from: PG */
/* renamed from: aruh  reason: default package */
/* loaded from: classes2.dex */
public final class aruh extends aopi implements aoqv {
    public static final aruh a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public aruf d;
    public auna e;
    private arbf h;
    private byte i = 2;
    public aoob f = aoob.b;

    static {
        aruh aruhVar = new aruh();
        a = aruhVar;
        aopi.registerDefaultInstance(aruh.class, aruhVar);
    }

    private aruh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h"});
            case 3:
                return new aruh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aruh.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
