package defpackage;
/* compiled from: PG */
/* renamed from: aupp  reason: default package */
/* loaded from: classes2.dex */
public final class aupp extends aopi implements aoqv {
    public static final aupp a;
    private static volatile aorb c;
    public aunb b;
    private int d;
    private arag e;
    private arag f;
    private apzg g;
    private arag h;
    private aoux i;
    private byte j = 2;

    static {
        aupp auppVar = new aupp();
        a = auppVar;
        aopi.registerDefaultInstance(aupp.class, auppVar);
    }

    private aupp() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0006\u0007ᐉ\u0004\tᐉ\u0001", new Object[]{"d", "e", "f", "g", "i", "h", "b"});
            case 3:
                return new aupp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aupp.class) {
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
