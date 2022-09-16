package defpackage;
/* compiled from: PG */
/* renamed from: avjk  reason: default package */
/* loaded from: classes2.dex */
public final class avjk extends aopi implements aoqv {
    public static final avjk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aoux e;
    private byte f = 2;

    static {
        avjk avjkVar = new avjk();
        a = avjkVar;
        aopi.registerDefaultInstance(avjk.class, avjkVar);
    }

    private avjk() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0003", new Object[]{"c", "d", "e"});
            case 3:
                return new avjk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avjk.class) {
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
