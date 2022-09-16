package defpackage;
/* compiled from: PG */
/* renamed from: aubk  reason: default package */
/* loaded from: classes2.dex */
public final class aubk extends aopi implements aoqv {
    public static final aubk a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public arag f;
    private aoux i;
    private byte j = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        aubk aubkVar = new aubk();
        a = aubkVar;
        aopi.registerDefaultInstance(aubk.class, aubkVar);
        b = aopi.newSingularGeneratedExtension(auna.a, aubkVar, aubkVar, null, 57158578, aosj.MESSAGE, aubk.class);
    }

    private aubk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0004\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005Л", new Object[]{"c", "d", aubm.class, "f", "i", "g", "e", aubl.class});
            case 3:
                return new aubk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aubk.class) {
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
