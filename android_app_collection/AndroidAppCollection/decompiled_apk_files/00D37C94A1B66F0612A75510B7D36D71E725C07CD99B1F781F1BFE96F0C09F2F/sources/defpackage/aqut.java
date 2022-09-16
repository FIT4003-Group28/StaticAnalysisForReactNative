package defpackage;
/* compiled from: PG */
/* renamed from: aqut  reason: default package */
/* loaded from: classes2.dex */
public final class aqut extends aopi implements aoqv {
    public static final aqut a;
    private static volatile aorb i;
    public int b;
    public arag d;
    public aopu e;
    public apzg f;
    public aoux g;
    public aoob h;
    private arag j;
    private byte k = 2;
    public String c = "";

    static {
        aqut aqutVar = new aqut();
        a = aqutVar;
        aopi.registerDefaultInstance(aqut.class, aqutVar);
    }

    private aqut() {
        emptyProtobufList();
        this.e = aopi.emptyProtobufList();
        this.h = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0006\t\u001a", new Object[]{"b", "c", "d", "j", "f", "g", "h", "e"});
            case 3:
                return new aqut();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqut.class) {
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
