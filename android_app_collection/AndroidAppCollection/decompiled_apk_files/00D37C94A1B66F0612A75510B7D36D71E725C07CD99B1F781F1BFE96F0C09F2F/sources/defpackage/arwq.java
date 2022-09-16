package defpackage;
/* compiled from: PG */
/* renamed from: arwq  reason: default package */
/* loaded from: classes2.dex */
public final class arwq extends aopi implements aoqv {
    public static final arwq a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public apzg d;
    public arxj e;
    private arag i;
    private arag j;
    private apzg k;
    private aunb l;
    private arbf m;
    private aoux n;
    private byte o = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        arwq arwqVar = new arwq();
        a = arwqVar;
        aopi.registerDefaultInstance(arwq.class, arwqVar);
    }

    private arwq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001̉\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006ᐉ\u0003\u0007ဉ\u0005\bᐉ\u0004\tᐉ\b\nည\t\u000bᐉ\u0006̉ᐉ\u0007", new Object[]{"b", "c", "i", "j", "f", arxk.class, "d", "e", "k", "n", "g", "l", "m"});
            case 3:
                return new arwq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arwq.class) {
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
