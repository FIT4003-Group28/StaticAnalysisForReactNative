package defpackage;
/* compiled from: PG */
/* renamed from: auhx  reason: default package */
/* loaded from: classes2.dex */
public final class auhx extends aopi implements aoqv {
    public static final auhx a;
    private static volatile aorb k;
    public int b;
    public arhs c;
    public arag d;
    public arag e;
    public aunb h;
    public auij i;
    public auhy j;
    private byte l = 2;
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        auhx auhxVar = new auhx();
        a = auhxVar;
        aopi.registerDefaultInstance(auhx.class, auhxVar);
    }

    private auhx() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005Л\u0006ᐉ\u0003\u0007ဉ\u0004\bဉ\u0005", new Object[]{"b", "c", "d", "e", "f", apzg.class, "g", apzg.class, "h", "i", "j"});
            case 3:
                return new auhx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (auhx.class) {
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
