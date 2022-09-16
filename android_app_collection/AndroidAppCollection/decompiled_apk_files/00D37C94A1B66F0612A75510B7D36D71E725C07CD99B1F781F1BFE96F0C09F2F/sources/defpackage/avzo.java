package defpackage;
/* compiled from: PG */
/* renamed from: avzo  reason: default package */
/* loaded from: classes2.dex */
public final class avzo extends aopi implements aoqv {
    public static final avzo a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private apzg i;
    private aozy j;
    private byte k = 2;

    static {
        avzo avzoVar = new avzo();
        a = avzoVar;
        aopi.registerDefaultInstance(avzo.class, avzoVar);
    }

    private avzo() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0004\u0006ᐉ\u0003\bᐉ\u0006\tᐉ\u0007\nᐉ\u0005", new Object[]{"c", "d", "e", "g", "f", "i", "j", "h"});
            case 3:
                return new avzo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avzo.class) {
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
