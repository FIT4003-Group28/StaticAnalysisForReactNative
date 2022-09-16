package defpackage;
/* compiled from: PG */
/* renamed from: audq  reason: default package */
/* loaded from: classes2.dex */
public final class audq extends aopi implements aoqv {
    public static final audq a;
    private static volatile aorb c;
    public aqre b;
    private int d;
    private arag e;
    private apzg f;
    private byte g = 2;

    static {
        audq audqVar = new audq();
        a = audqVar;
        aopi.registerDefaultInstance(audq.class, audqVar);
    }

    private audq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0006ᐉ\u0005", new Object[]{"d", "e", "b", "f"});
            case 3:
                return new audq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (audq.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
