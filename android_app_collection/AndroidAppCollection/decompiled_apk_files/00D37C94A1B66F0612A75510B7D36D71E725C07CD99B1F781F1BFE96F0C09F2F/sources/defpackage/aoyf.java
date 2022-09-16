package defpackage;
/* compiled from: PG */
/* renamed from: aoyf  reason: default package */
/* loaded from: classes.dex */
public final class aoyf extends aopi implements aoqv {
    public static final aoyf a;
    private static volatile aorb f;
    public int b;
    public apzg c;
    private aoux g;
    private byte h = 2;
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        aoyf aoyfVar = new aoyf();
        a = aoyfVar;
        aopi.registerDefaultInstance(aoyf.class, aoyfVar);
    }

    private aoyf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ည\u0002", new Object[]{"b", "c", "d", apzg.class, "g", "e"});
            case 3:
                return new aoyf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aoyf.class) {
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
