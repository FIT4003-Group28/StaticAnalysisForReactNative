package defpackage;
/* compiled from: PG */
/* renamed from: asss  reason: default package */
/* loaded from: classes2.dex */
public final class asss extends aopi implements aoqv {
    public static final asss a;
    private static volatile aorb i;
    public int b;
    public arhs c;
    public arag d;
    public aunb e;
    public apzg f;
    private byte j = 2;
    public aopu g = emptyProtobufList();
    public aopu h = emptyProtobufList();

    static {
        asss asssVar = new asss();
        a = asssVar;
        aopi.registerDefaultInstance(asss.class, asssVar);
    }

    private asss() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0006\u0001ᐉ\u0001\u0002Л\u0003Л\u0004ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "d", "g", assr.class, "h", asst.class, "c", "e", "f"});
            case 3:
                return new asss();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asss.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
