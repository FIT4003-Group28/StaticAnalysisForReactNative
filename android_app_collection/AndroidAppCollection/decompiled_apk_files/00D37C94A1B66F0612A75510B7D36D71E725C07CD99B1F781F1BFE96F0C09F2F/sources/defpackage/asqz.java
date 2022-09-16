package defpackage;
/* compiled from: PG */
/* renamed from: asqz  reason: default package */
/* loaded from: classes2.dex */
public final class asqz extends aopi implements aoqv {
    public static final asqz a;
    private static volatile aorb h;
    public int b;
    public arag e;
    public arag f;
    public avhn g;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private apzg m;
    private byte n = 2;
    public String c = "";
    public String d = "";

    static {
        asqz asqzVar = new asqz();
        a = asqzVar;
        aopi.registerDefaultInstance(asqz.class, asqzVar);
    }

    private asqz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\b\u0001ဈ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ဈ\u0003\bᐉ\n\nᐉ\b\u000bᐉ\t\rᐉ\u0002", new Object[]{"b", "c", "e", "f", "j", "g", "d", "m", "k", "l", "i"});
            case 3:
                return new asqz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asqz.class) {
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
