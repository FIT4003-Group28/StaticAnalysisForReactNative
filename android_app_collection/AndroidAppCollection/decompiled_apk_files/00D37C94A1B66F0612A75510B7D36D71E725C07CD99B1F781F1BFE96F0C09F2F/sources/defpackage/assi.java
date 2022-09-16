package defpackage;
/* compiled from: PG */
/* renamed from: assi  reason: default package */
/* loaded from: classes2.dex */
public final class assi extends aopi implements aoqv {
    public static final assi a;
    private static volatile aorb f;
    public arag e;
    private int g;
    private aunb h;
    private aoux i;
    private byte j = 2;
    public String b = "";
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;

    static {
        assi assiVar = new assi();
        a = assiVar;
        aopi.registerDefaultInstance(assi.class, assiVar);
    }

    private assi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\u0006ᐉ\u0004", new Object[]{"g", "b", "c", aunb.class, "h", "i", "d", "e"});
            case 3:
                return new assi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (assi.class) {
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
