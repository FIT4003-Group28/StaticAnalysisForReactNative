package defpackage;
/* compiled from: PG */
/* renamed from: aupw  reason: default package */
/* loaded from: classes2.dex */
public final class aupw extends aopi implements aoqv {
    public static final aupw a;
    public static final aopg b;
    private static volatile aorb k;
    public int c;
    public Object e;
    public arhs f;
    public apzg i;
    public boolean j;
    private aoux l;
    public int d = 0;
    private byte m = 2;
    public aopu g = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        aupw aupwVar = new aupw();
        a = aupwVar;
        aopi.registerDefaultInstance(aupw.class, aupwVar);
        b = aopi.newSingularGeneratedExtension(auna.a, aupwVar, aupwVar, null, 106506504, aosj.MESSAGE, aupw.class);
    }

    private aupw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0001\u0006\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003Л\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0002\u0007ᐉ\u0005\bဇ\u0006", new Object[]{"e", "d", "c", aupx.class, arag.class, "g", aupy.class, "l", "h", "f", "i", "j"});
            case 3:
                return new aupw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aupw.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
