package defpackage;
/* compiled from: PG */
/* renamed from: arqh  reason: default package */
/* loaded from: classes2.dex */
public final class arqh extends aopi implements aoqv {
    public static final arqh a;
    private static volatile aorb e;
    public arpa b;
    public int c;
    private int f;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        arqh arqhVar = new arqh();
        a = arqhVar;
        aopi.registerDefaultInstance(arqh.class, arqhVar);
    }

    private arqh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0003ဌ\u0001\u0005\u001b", new Object[]{"f", "b", "c", auii.o, "d", arqi.class});
            case 3:
                return new arqh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arqh.class) {
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
