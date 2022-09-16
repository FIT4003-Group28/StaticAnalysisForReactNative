package defpackage;
/* compiled from: PG */
/* renamed from: awhy  reason: default package */
/* loaded from: classes2.dex */
public final class awhy extends aopi implements aoqv {
    public static final awhy a;
    private static volatile aorb e;
    public int b;
    public awhv d;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        awhy awhyVar = new awhy();
        a = awhyVar;
        aopi.registerDefaultInstance(awhy.class, awhyVar);
    }

    private awhy() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001Л\u0003ᐉ\u0000", new Object[]{"b", "c", awhz.class, "d"});
            case 3:
                return new awhy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awhy.class) {
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
