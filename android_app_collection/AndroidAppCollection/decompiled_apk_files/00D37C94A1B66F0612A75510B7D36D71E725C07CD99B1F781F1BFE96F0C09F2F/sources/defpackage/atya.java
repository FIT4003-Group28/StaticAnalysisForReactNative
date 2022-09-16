package defpackage;
/* compiled from: PG */
/* renamed from: atya  reason: default package */
/* loaded from: classes2.dex */
public final class atya extends aopi implements aoqv {
    public static final atya a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public apzg g;
    public apzg h;
    public apzg i;
    public apzg j;
    public apzg k;
    private aoux m;
    public int c = 0;
    private byte n = 2;
    public aoob e = aoob.b;
    public String f = "";

    static {
        atya atyaVar = new atya();
        a = atyaVar;
        aopi.registerDefaultInstance(atya.class, atyaVar);
    }

    private atya() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ြ\u0000\u0005်\u0000\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t", new Object[]{"d", "c", "b", "m", "e", "f", atxz.class, "g", "h", "i", "j", "k"});
            case 3:
                return new atya();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atya.class) {
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
