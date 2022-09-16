package defpackage;
/* compiled from: PG */
/* renamed from: awzf  reason: default package */
/* loaded from: classes2.dex */
public final class awzf extends aopi implements aoqv {
    public static final awzf a;
    private static volatile aorb f;
    public int b;
    public aoob c;
    public int d;
    public int e;

    static {
        awzf awzfVar = new awzf();
        a = awzfVar;
        aopi.registerDefaultInstance(awzf.class, awzfVar);
    }

    private awzf() {
        emptyProtobufList();
        this.c = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0000\u0004ည\u0002\u0007ဋ\u0005\nဋ\b", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awzf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awzf.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
