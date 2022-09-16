package defpackage;
/* compiled from: PG */
/* renamed from: avlp  reason: default package */
/* loaded from: classes2.dex */
public final class avlp extends aopi implements aoqv {
    public static final avlp a;
    private static volatile aorb e;
    public arag b;
    public arag c;
    private int f;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        avlp avlpVar = new avlp();
        a = avlpVar;
        aopi.registerDefaultInstance(avlp.class, avlpVar);
    }

    private avlp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"f", "b", "c", "d", aunb.class});
            case 3:
                return new avlp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avlp.class) {
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
