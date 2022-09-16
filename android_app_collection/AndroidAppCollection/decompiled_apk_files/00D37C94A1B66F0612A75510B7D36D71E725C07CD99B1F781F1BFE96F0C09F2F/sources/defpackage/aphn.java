package defpackage;
/* compiled from: PG */
/* renamed from: aphn  reason: default package */
/* loaded from: classes.dex */
public final class aphn extends aopi implements aoqv {
    public static final aphn a;
    private static volatile aorb i;
    public int b;
    public avhn c;
    public aphm d;
    public aphl e;
    public boolean h;
    private aoux j;
    private byte k = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        aphn aphnVar = new aphn();
        a = aphnVar;
        aopi.registerDefaultInstance(aphn.class, aphnVar);
    }

    private aphn() {
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
                return new aphn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aphn.class) {
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
