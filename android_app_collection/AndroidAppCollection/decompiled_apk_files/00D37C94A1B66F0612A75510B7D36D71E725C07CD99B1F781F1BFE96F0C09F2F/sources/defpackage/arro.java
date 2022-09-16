package defpackage;
/* compiled from: PG */
/* renamed from: arro  reason: default package */
/* loaded from: classes2.dex */
public final class arro extends aopi implements aoqv {
    public static final arro a;
    private static volatile aorb g;
    public int b;
    public arag d;
    public int f;
    private aoux h;
    private apok i;
    private apok j;
    private apzg k;
    private apok l;
    private byte m = 2;
    public aoob c = aoob.b;
    public aopu e = emptyProtobufList();

    static {
        arro arroVar = new arro();
        a = arroVar;
        aopi.registerDefaultInstance(arro.class, arroVar);
    }

    private arro() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဌ\u0007", new Object[]{"b", "h", "c", "d", "e", arrp.class, "i", "j", "k", "l", "f", aqfh.p});
            case 3:
                return new arro();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arro.class) {
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
