package defpackage;
/* compiled from: PG */
/* renamed from: aquw  reason: default package */
/* loaded from: classes2.dex */
public final class aquw extends aopi implements aoqv {
    public static final aquw a;
    private static volatile aorb l;
    public int b;
    public avhn d;
    public arag f;
    public arag g;
    public arag h;
    public arag i;
    public apzg j;
    private arag m;
    private arag n;
    private arag o;
    private aoux p;
    private byte q = 2;
    public String c = "";
    public aopu e = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        aquw aquwVar = new aquw();
        a = aquwVar;
        aopi.registerDefaultInstance(aquw.class, aquwVar);
    }

    private aquw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u000b\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\t\nᐉ\f\u000bᐉ\r\fည\u000e\rᐉ\b\u000eᐉ\u0006\u0010Л", new Object[]{"b", "c", "d", "f", "g", "h", "n", "i", "j", "p", "k", "o", "m", "e", avhc.class});
            case 3:
                return new aquw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aquw.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
