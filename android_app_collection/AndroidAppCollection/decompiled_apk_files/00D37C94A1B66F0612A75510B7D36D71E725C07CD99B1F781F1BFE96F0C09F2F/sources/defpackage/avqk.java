package defpackage;
/* compiled from: PG */
/* renamed from: avqk  reason: default package */
/* loaded from: classes2.dex */
public final class avqk extends aopi implements aoqv {
    public static final avqk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aoux e;
    private byte f = 2;

    static {
        avqk avqkVar = new avqk();
        a = avqkVar;
        aopi.registerDefaultInstance(avqk.class, avqkVar);
    }

    private avqk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0003\u0004ᐉ\u0000", new Object[]{"c", "e", "d"});
            case 3:
                return new avqk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqk.class) {
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
