package defpackage;
/* compiled from: PG */
/* renamed from: ascp  reason: default package */
/* loaded from: classes2.dex */
public final class ascp extends aopi implements aoqv {
    public static final ascp a;
    private static volatile aorb g;
    public arpa b;
    public ascu e;
    public aoob f;
    private int h;
    private arag i;
    private aoux j;
    private arbf k;
    private byte l = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        ascp ascpVar = new ascp();
        a = ascpVar;
        aopi.registerDefaultInstance(ascp.class, ascpVar);
    }

    private ascp() {
        emptyProtobufList();
        this.f = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001̉\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0006Л\u0007Л\bᐉ\u0002\tᐉ\u0003\nည\u0004\u000bᐉ\u0001̉ᐉ\u0005", new Object[]{"h", "b", "c", ascu.class, "d", ascq.class, "e", "j", "f", "i", "k"});
            case 3:
                return new ascp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (ascp.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
