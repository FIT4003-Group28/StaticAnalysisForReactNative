package defpackage;
/* compiled from: PG */
/* renamed from: arog  reason: default package */
/* loaded from: classes2.dex */
public final class arog extends aopi implements aoqv {
    public static final arog a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public aroh d;
    public arnh f;
    private arbf h;
    private byte i = 2;
    public aopu e = emptyProtobufList();

    static {
        arog arogVar = new arog();
        a = arogVar;
        aopi.registerDefaultInstance(arog.class, arogVar);
    }

    private arog() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\u0005ᐉ\u0002̉ᐉ\u0003", new Object[]{"b", "c", "d", "e", apzg.class, "f", "h"});
            case 3:
                return new arog();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arog.class) {
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
