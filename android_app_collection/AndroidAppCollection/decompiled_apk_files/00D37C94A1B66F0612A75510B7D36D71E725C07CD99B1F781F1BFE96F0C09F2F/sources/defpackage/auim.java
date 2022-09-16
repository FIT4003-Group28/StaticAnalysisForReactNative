package defpackage;
/* compiled from: PG */
/* renamed from: auim  reason: default package */
/* loaded from: classes2.dex */
public final class auim extends aopi implements aoqv {
    public static final auim a;
    private static volatile aorb i;
    public int b;
    public auil c;
    public aunb e;
    public aozy f;
    private aoux j;
    private aunb k;
    private byte l = 2;
    public aopu d = emptyProtobufList();
    public aoob g = aoob.b;
    public String h = "";

    static {
        auim auimVar = new auim();
        a = auimVar;
        aopi.registerDefaultInstance(auim.class, auimVar);
    }

    private auim() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ᐉ\u0005\bဈ\u0006", new Object[]{"b", "c", "d", auif.class, "e", "f", "j", "g", "k", "h"});
            case 3:
                return new auim();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auim.class) {
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
