package defpackage;
/* compiled from: PG */
/* renamed from: awdv  reason: default package */
/* loaded from: classes2.dex */
public final class awdv extends aopi implements aoqv {
    public static final awdv a;
    private static volatile aorb e;
    public int b;
    public int d;
    private aoux f;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        awdv awdvVar = new awdv();
        a = awdvVar;
        aopi.registerDefaultInstance(awdv.class, awdvVar);
    }

    private awdv() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001Л\u0003ᐉ\u0001\u0005င\u0000", new Object[]{"b", "c", awdn.class, "f", "d"});
            case 3:
                return new awdv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awdv.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
