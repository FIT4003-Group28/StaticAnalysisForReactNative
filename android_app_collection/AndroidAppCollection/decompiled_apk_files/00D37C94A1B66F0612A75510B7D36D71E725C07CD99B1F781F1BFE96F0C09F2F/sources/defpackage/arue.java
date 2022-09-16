package defpackage;
/* compiled from: PG */
/* renamed from: arue  reason: default package */
/* loaded from: classes2.dex */
public final class arue extends aopi implements aoqv {
    public static final arue a;
    private static volatile aorb e;
    public int b;
    public arpa c;
    public auup d;
    private aoux f;
    private aunb g;
    private apzg h;
    private byte i = 2;

    static {
        arue arueVar = new arue();
        a = arueVar;
        aopi.registerDefaultInstance(arue.class, arueVar);
    }

    private arue() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "f", "g", "h"});
            case 3:
                return new arue();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arue.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
