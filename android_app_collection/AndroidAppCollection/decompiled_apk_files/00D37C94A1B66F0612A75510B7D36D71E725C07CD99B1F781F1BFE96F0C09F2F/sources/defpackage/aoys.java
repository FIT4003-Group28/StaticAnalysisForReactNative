package defpackage;
/* compiled from: PG */
/* renamed from: aoys  reason: default package */
/* loaded from: classes.dex */
public final class aoys extends aopi implements aoqv {
    public static final aoys a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apzg f;
    public arag h;
    public apzg i;
    private arag k;
    private aunb l;
    private aunb m;
    private aoux n;
    private byte o = 2;
    public aopu g = emptyProtobufList();

    static {
        aoys aoysVar = new aoys();
        a = aoysVar;
        aopi.registerDefaultInstance(aoys.class, aoysVar);
    }

    private aoys() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0005\u0007ᐉ\u0003\bᐉ\u0006\nᐉ\b\u000bᐉ\t\fᐉ\u0007\rᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", aoyr.class, "h", "f", "i", "m", "n", "l", "k"});
            case 3:
                return new aoys();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aoys.class) {
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
