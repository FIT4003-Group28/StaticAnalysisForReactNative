package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awdq  reason: default package */
/* loaded from: classes2.dex */
public final class awdq extends aopi implements aoqv {
    public static final awdq a;
    private static volatile aorb e;
    public int b;
    public arag c;
    private aoux f;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        awdq awdqVar = new awdq();
        a = awdqVar;
        aopi.registerDefaultInstance(awdq.class, awdqVar);
    }

    private awdq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"b", "c", "d", awdr.class, "f"});
            case 3:
                return new awdq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awdq.class) {
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
