package defpackage;
/* compiled from: PG */
/* renamed from: askq  reason: default package */
/* loaded from: classes2.dex */
public final class askq extends aopi implements aoqv {
    public static final askq a;
    private static volatile aorb e;
    public int b;
    public askr c;
    private byte f = 2;
    public aopu d = emptyProtobufList();

    static {
        askq askqVar = new askq();
        a = askqVar;
        aopi.registerDefaultInstance(askq.class, askqVar);
    }

    private askq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"b", "c", "d", askp.class});
            case 3:
                return new askq();
            case 4:
                return new aopa((byte[][][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (askq.class) {
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
