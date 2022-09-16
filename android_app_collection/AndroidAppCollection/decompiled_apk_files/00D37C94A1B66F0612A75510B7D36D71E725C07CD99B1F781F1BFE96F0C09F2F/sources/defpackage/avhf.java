package defpackage;
/* compiled from: PG */
/* renamed from: avhf  reason: default package */
/* loaded from: classes2.dex */
public final class avhf extends aopi implements aoqv {
    public static final avhf a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private apzg e;
    private aoux f;
    private byte g = 2;

    static {
        avhf avhfVar = new avhf();
        a = avhfVar;
        aopi.registerDefaultInstance(avhf.class, avhfVar);
    }

    private avhf() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0006\u000b\u0003\u0000\u0000\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006\u000bᐉ\n", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new avhf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avhf.class) {
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
