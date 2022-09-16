package defpackage;
/* compiled from: PG */
/* renamed from: avcm  reason: default package */
/* loaded from: classes2.dex */
public final class avcm extends aopi implements aoqv {
    public static final avcm a;
    private static volatile aorb g;
    public int b;
    public aunb c;
    public apzg e;
    private aoux h;
    private byte i = 2;
    public aopu d = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        avcm avcmVar = new avcm();
        a = avcmVar;
        aopi.registerDefaultInstance(avcm.class, avcmVar);
    }

    private avcm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003", new Object[]{"b", "c", "d", aunb.class, "e", "h", "f"});
            case 3:
                return new avcm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avcm.class) {
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
