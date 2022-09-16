package defpackage;
/* compiled from: PG */
/* renamed from: aren  reason: default package */
/* loaded from: classes2.dex */
public final class aren extends aopi implements aoqv {
    public static final aren a;
    private static volatile aorb m;
    public int b;
    public aueo c;
    public arag e;
    public int f;
    public arag g;
    public arag h;
    public arag i;
    public apzg j;
    public ates k;
    public aoob l;
    private apok n;
    private aoux o;
    private byte p = 2;
    public aopu d = emptyProtobufList();

    static {
        aren arenVar = new aren();
        a = arenVar;
        aopi.registerDefaultInstance(aren.class, arenVar);
    }

    private aren() {
        emptyProtobufList();
        emptyProtobufList();
        this.l = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\r\f\u0000\u0001\n\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tЛ\nᐉ\n\u000bည\u000b\fင\u0003\rᐉ\t", new Object[]{"b", "c", "e", "g", "h", "i", "j", "k", "d", avhc.class, "o", "l", "f", "n"});
            case 3:
                return new aren();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aren.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
