package defpackage;
/* compiled from: PG */
/* renamed from: arhm  reason: default package */
/* loaded from: classes2.dex */
public final class arhm extends aopi implements aoqv {
    public static final arhm a;
    private static volatile aorb l;
    public int b;
    public arhs d;
    public boolean f;
    public int g;
    public apzg h;
    public aovr i;
    private aoux m;
    private byte n = 2;
    public String c = "";
    public String e = "";
    public String j = "";
    public aoob k = aoob.b;

    static {
        arhm arhmVar = new arhm();
        a = arhmVar;
        aopi.registerDefaultInstance(arhm.class, arhmVar);
    }

    private arhm() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဌ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0006ည\t\u0007ဈ\u0002\bဇ\u0003\tဈ\u0007\nဉ\u0006", new Object[]{"b", "c", "d", "g", arfp.n, "h", "m", "k", "e", "f", "j", "i"});
            case 3:
                return new arhm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arhm.class) {
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
