package defpackage;
/* compiled from: PG */
/* renamed from: awqq  reason: default package */
/* loaded from: classes2.dex */
public final class awqq extends aopi implements aoqv {
    public static final awqq a;
    private static volatile aorb f;
    public int b;
    private byte g = 2;
    public aopu c = emptyProtobufList();
    public String d = "";
    public aopu e = emptyProtobufList();

    static {
        awqq awqqVar = new awqq();
        a = awqqVar;
        aopi.registerDefaultInstance(awqq.class, awqqVar);
    }

    private awqq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002ဈ\u0000\u0003\u001b", new Object[]{"b", "c", awqm.class, "d", "e", awqp.class});
            case 3:
                return new awqq();
            case 4:
                return new aopa((int[][][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awqq.class) {
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
