package defpackage;
/* compiled from: PG */
/* renamed from: aphj  reason: default package */
/* loaded from: classes.dex */
public final class aphj extends aopi implements aoqv {
    public static final aphj a;
    private static volatile aorb h;
    public int b;
    public apzg e;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        aphj aphjVar = new aphj();
        a = aphjVar;
        aopi.registerDefaultInstance(aphj.class, aphjVar);
    }

    private aphj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003\u0005Л\u0006Л", new Object[]{"b", "c", "d", "e", "f", apzg.class, "g", apzg.class});
            case 3:
                return new aphj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aphj.class) {
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
