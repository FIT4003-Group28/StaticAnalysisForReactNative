package defpackage;
/* compiled from: PG */
/* renamed from: aqus  reason: default package */
/* loaded from: classes2.dex */
public final class aqus extends aopi implements aoqv {
    public static final aqus a;
    private static volatile aorb f;
    public int b;
    public aoux d;
    public aoob e;
    private arag g;
    private arag h;
    private arag i;
    private byte j = 2;
    public aopu c = emptyProtobufList();

    static {
        aqus aqusVar = new aqus();
        a = aqusVar;
        aopi.registerDefaultInstance(aqus.class, aqusVar);
    }

    private aqus() {
        emptyProtobufList();
        this.e = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0005\u0002Л\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\bᐉ\u000b\tည\f", new Object[]{"b", "c", aqur.class, "g", "h", "i", "d", "e"});
            case 3:
                return new aqus();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqus.class) {
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
