package defpackage;
/* compiled from: PG */
/* renamed from: avrv  reason: default package */
/* loaded from: classes2.dex */
public final class avrv extends aopi implements aoqv {
    public static final avrv a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private arag g;
    private arag h;
    private aoux i;
    private byte j = 2;

    static {
        avrv avrvVar = new avrv();
        a = avrvVar;
        aopi.registerDefaultInstance(avrv.class, avrvVar);
    }

    private avrv() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\r\u0006\u0000\u0000\u0006\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\bᐉ\u000b\u000bᐉ\u0007\rᐉ\b", new Object[]{"c", "d", "e", "f", "i", "g", "h"});
            case 3:
                return new avrv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrv.class) {
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
