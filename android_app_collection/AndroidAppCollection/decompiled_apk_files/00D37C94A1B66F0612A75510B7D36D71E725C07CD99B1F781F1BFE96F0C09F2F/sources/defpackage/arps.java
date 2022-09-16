package defpackage;
/* compiled from: PG */
/* renamed from: arps  reason: default package */
/* loaded from: classes2.dex */
public final class arps extends aopi implements aoqv {
    public static final arps a;
    private static volatile aorb h;
    public arpa b;
    public arpv d;
    public arpw e;
    public aoob g;
    private int i;
    private aoux j;
    private byte k = 2;
    public aopu c = emptyProtobufList();
    public aopu f = emptyProtobufList();

    static {
        arps arpsVar = new arps();
        a = arpsVar;
        aopi.registerDefaultInstance(arps.class, arpsVar);
    }

    private arps() {
        emptyProtobufList();
        this.g = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0006\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0005ᐉ\u0002\u0007ᐉ\u0003\bည\u0004\tЛ", new Object[]{"i", "b", "c", arpq.class, "d", "e", "j", "g", "f", apzg.class});
            case 3:
                return new arps();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arps.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
