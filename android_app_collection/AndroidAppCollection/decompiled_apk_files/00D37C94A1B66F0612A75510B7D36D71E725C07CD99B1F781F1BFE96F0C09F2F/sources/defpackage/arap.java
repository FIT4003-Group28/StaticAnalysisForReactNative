package defpackage;
/* compiled from: PG */
/* renamed from: arap  reason: default package */
/* loaded from: classes2.dex */
public final class arap extends aopi implements aoqv {
    public static final arap a;
    private static volatile aorb r;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public boolean k;
    public avhn l;
    public aunb n;
    public aunb o;
    private aoux s;
    private byte t = 2;
    public aopu m = emptyProtobufList();
    public aoob p = aoob.b;
    public String q = "";

    static {
        arap arapVar = new arap();
        a = arapVar;
        aopi.registerDefaultInstance(arap.class, arapVar);
    }

    private arap() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\fᐉ\n\rᐉ\u000b\u000eᐉ\f\u000fည\r\u0010ဈ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", araq.class, "n", "o", "s", "p", "q"});
            case 3:
                return new arap();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (arap.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
