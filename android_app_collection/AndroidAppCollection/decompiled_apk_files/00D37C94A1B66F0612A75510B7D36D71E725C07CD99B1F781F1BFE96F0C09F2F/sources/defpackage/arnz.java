package defpackage;
/* compiled from: PG */
/* renamed from: arnz  reason: default package */
/* loaded from: classes2.dex */
public final class arnz extends aopi implements aoqv {
    public static final arnz a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public aroa d;
    public arnh f;
    private arbf h;
    private byte i = 2;
    public aopu e = emptyProtobufList();

    static {
        arnz arnzVar = new arnz();
        a = arnzVar;
        aopi.registerDefaultInstance(arnz.class, arnzVar);
    }

    private arnz() {
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
                return new arnz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arnz.class) {
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
