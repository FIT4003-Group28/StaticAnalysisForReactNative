package defpackage;
/* compiled from: PG */
/* renamed from: apza  reason: default package */
/* loaded from: classes2.dex */
public final class apza extends aopi implements aoqv {
    public static final apza a;
    private static volatile aorb i;
    public int b;
    public avhn c;
    public apzb d;
    public apyz e;
    public boolean h;
    private aoux j;
    private byte k = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        apza apzaVar = new apza();
        a = apzaVar;
        aopi.registerDefaultInstance(apza.class, apzaVar);
    }

    private apza() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004\u001b\u0005ᐉ\u0003\u0006ည\u0004\bဇ\u0005", new Object[]{"b", "c", "d", "e", "f", aoym.class, "j", "g", "h"});
            case 3:
                return new apza();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apza.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
