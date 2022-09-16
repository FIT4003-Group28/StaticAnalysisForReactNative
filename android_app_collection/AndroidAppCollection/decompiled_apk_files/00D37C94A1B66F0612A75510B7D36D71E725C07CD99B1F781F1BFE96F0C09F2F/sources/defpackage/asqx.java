package defpackage;
/* compiled from: PG */
/* renamed from: asqx  reason: default package */
/* loaded from: classes2.dex */
public final class asqx extends aopi implements aoqv {
    public static final asqx a;
    private static volatile aorb h;
    public int b;
    public arag d;
    public arag e;
    public avhn f;
    public apzg g;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private aoux m;
    private byte n = 2;
    public String c = "";

    static {
        asqx asqxVar = new asqx();
        a = asqxVar;
        aopi.registerDefaultInstance(asqx.class, asqxVar);
    }

    private asqx() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\t\u0001ဈ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\b\nᐉ\t\u000bᐉ\n\u000eᐉ\f\u0012ᐉ\u0006\u0013ᐉ\u0007", new Object[]{"b", "c", "i", "d", "e", "k", "l", "g", "m", "j", "f"});
            case 3:
                return new asqx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asqx.class) {
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
