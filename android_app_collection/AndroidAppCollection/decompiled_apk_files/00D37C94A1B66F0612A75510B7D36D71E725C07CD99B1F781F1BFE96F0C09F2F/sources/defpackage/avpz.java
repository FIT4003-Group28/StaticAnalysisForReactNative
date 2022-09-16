package defpackage;
/* compiled from: PG */
/* renamed from: avpz  reason: default package */
/* loaded from: classes2.dex */
public final class avpz extends aopi implements aoqv {
    public static final avpz a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private aoux g;
    private byte h = 2;

    static {
        avpz avpzVar = new avpz();
        a = avpzVar;
        aopi.registerDefaultInstance(avpz.class, avpzVar);
    }

    private avpz() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\t\u0004\u0000\u0000\u0004\u0004ᐉ\u0003\u0006ᐉ\u0006\bᐉ\b\tᐉ\u0004", new Object[]{"c", "d", "f", "g", "e"});
            case 3:
                return new avpz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpz.class) {
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
