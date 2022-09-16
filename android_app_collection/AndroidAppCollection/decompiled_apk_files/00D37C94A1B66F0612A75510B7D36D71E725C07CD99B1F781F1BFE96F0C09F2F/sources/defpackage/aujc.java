package defpackage;
/* compiled from: PG */
/* renamed from: aujc  reason: default package */
/* loaded from: classes2.dex */
public final class aujc extends aopi implements aoqv {
    public static final aujc a;
    private static volatile aorb i;
    public int b;
    public aujb c;
    public aunb e;
    public aozy f;
    private aoux j;
    private byte k = 2;
    public aopu d = emptyProtobufList();
    public aoob g = aoob.b;
    public String h = "";

    static {
        aujc aujcVar = new aujc();
        a = aujcVar;
        aopi.registerDefaultInstance(aujc.class, aujcVar);
    }

    private aujc() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0002\u0007ဈ\u0005", new Object[]{"b", "c", "d", auif.class, "e", "j", "g", "f", "h"});
            case 3:
                return new aujc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aujc.class) {
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
