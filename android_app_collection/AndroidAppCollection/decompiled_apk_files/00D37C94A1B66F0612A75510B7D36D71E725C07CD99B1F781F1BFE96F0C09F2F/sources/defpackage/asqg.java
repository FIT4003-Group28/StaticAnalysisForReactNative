package defpackage;
/* compiled from: PG */
/* renamed from: asqg  reason: default package */
/* loaded from: classes2.dex */
public final class asqg extends aopi implements aoqv {
    public static final asqg a;
    private static volatile aorb l;
    public int b;
    public aunb d;
    public aunb e;
    public boolean f;
    public String g;
    public apzg h;
    public apzg i;
    public boolean j;
    public int k;
    private byte m = 2;
    public String c = "";

    static {
        asqg asqgVar = new asqg();
        a = asqgVar;
        aopi.registerDefaultInstance(asqg.class, asqgVar);
    }

    private asqg() {
        emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0000\u0005ဇ\u0003\u0006ဈ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဇ\u0007\nဌ\b", new Object[]{"b", "d", "e", "c", "f", "g", "h", "i", "j", "k", asnz.j});
            case 3:
                return new asqg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (asqg.class) {
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
