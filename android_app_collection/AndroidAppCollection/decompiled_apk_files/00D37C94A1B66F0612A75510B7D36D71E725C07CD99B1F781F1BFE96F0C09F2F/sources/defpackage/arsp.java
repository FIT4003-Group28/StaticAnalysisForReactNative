package defpackage;
/* compiled from: PG */
/* renamed from: arsp  reason: default package */
/* loaded from: classes2.dex */
public final class arsp extends aopi implements aoqv {
    public static final arsp a;
    private static volatile aorb h;
    public Object c;
    public arpa d;
    public arsm e;
    private int i;
    private aoux j;
    private arbf k;
    public int b = 0;
    private byte l = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        arsp arspVar = new arsp();
        a = arspVar;
        aopi.registerDefaultInstance(arsp.class, arspVar);
    }

    private arsp() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001̉\t\u0000\u0001\b\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004Л\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ᐉ\u0005\bည\u0006\nᐼ\u0000̉ᐉ\u0007", new Object[]{"c", "b", "i", "d", "e", "f", arsl.class, arsn.class, arsk.class, "j", "g", aunb.class, "k"});
            case 3:
                return new arsp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arsp.class) {
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
