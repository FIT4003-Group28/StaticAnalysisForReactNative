package defpackage;
/* compiled from: PG */
/* renamed from: asat  reason: default package */
/* loaded from: classes2.dex */
public final class asat extends aopi implements aoqv {
    public static final asat a;
    private static volatile aorb j;
    public int b;
    public arpa c;
    public asau d;
    public asaw e;
    public apzg h;
    public String i;
    private apzg k;
    private aunb l;
    private aoux m;
    private arbf n;
    private byte o = 2;
    public aopu f = emptyProtobufList();
    public String g = "";

    static {
        asat asatVar = new asat();
        a = asatVar;
        aopi.registerDefaultInstance(asat.class, asatVar);
    }

    private asat() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        this.i = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001̉\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0003ᐉ\u0002\u0007Л\bဈ\u0007\tᐉ\b\nᐉ\t\rᐉ\u0004\u000eᐉ\n\u0010ᐉ\u000b\u0014ဈ\u000ẻᐉ\r", new Object[]{"b", "c", "d", "f", apzg.class, "g", "h", "k", "e", "l", "m", "i", "n"});
            case 3:
                return new asat();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asat.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
