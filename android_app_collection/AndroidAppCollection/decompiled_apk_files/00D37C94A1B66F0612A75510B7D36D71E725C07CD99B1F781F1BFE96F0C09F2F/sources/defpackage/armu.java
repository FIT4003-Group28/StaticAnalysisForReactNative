package defpackage;
/* compiled from: PG */
/* renamed from: armu  reason: default package */
/* loaded from: classes2.dex */
public final class armu extends aopi implements aoqv {
    public static final armu a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public apro d;
    public apzg e;
    public aoob f;
    private aoux h;
    private arbf i;
    private byte j = 2;

    static {
        armu armuVar = new armu();
        a = armuVar;
        aopi.registerDefaultInstance(armu.class, armuVar);
    }

    private armu() {
        emptyProtobufList();
        this.f = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0003\u0007ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "e", "h", "f", "i"});
            case 3:
                return new armu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (armu.class) {
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
