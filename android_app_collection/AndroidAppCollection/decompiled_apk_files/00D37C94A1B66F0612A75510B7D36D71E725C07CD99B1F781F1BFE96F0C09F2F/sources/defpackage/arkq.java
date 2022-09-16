package defpackage;
/* compiled from: PG */
/* renamed from: arkq  reason: default package */
/* loaded from: classes2.dex */
public final class arkq extends aopi implements aoqv {
    public static final arkq a;
    private static volatile aorb f;
    public arpa b;
    public boolean d;
    private int g;
    private aoux h;
    private byte i = 2;
    public aopu c = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        arkq arkqVar = new arkq();
        a = arkqVar;
        aopi.registerDefaultInstance(arkq.class, arkqVar);
    }

    private arkq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0005ဇ\u0002\u0007ᐉ\u0004\bည\u0005", new Object[]{"g", "b", "c", arkr.class, "d", "h", "e"});
            case 3:
                return new arkq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arkq.class) {
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
