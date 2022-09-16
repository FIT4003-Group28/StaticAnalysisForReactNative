package defpackage;
/* compiled from: PG */
/* renamed from: arsq  reason: default package */
/* loaded from: classes2.dex */
public final class arsq extends aopi implements aoqv {
    public static final arsq a;
    private static volatile aorb i;
    public boolean c;
    public int d;
    public long e;
    public arsz g;
    public arss h;
    private int j;
    private arta k;
    private arsy l;
    private arsw m;
    private byte n = 2;
    public String b = "";
    public aopu f = emptyProtobufList();

    static {
        arsq arsqVar = new arsq();
        a = arsqVar;
        aopi.registerDefaultInstance(arsq.class, arsqVar);
    }

    private arsq() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0006\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0007Л\bᐉ\u0007\tᐉ\b\nᐉ\f\u000eᐉ\t\u0011ᐉ\u000b", new Object[]{"j", "b", "c", "d", arpt.c, "e", "f", arsx.class, "g", "k", "h", "l", "m"});
            case 3:
                return new arsq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arsq.class) {
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
