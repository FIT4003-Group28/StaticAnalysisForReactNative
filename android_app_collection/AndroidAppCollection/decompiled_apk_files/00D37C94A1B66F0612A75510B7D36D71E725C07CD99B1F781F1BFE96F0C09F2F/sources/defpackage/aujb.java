package defpackage;
/* compiled from: PG */
/* renamed from: aujb  reason: default package */
/* loaded from: classes2.dex */
public final class aujb extends aopi implements aoqv {
    public static final aujb a;
    private static volatile aorb n;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apzg f;
    public aunb h;
    public long i;
    public apnp j;
    public auhy l;
    public aunb m;
    private byte o = 2;
    public aopu g = emptyProtobufList();
    public aopu k = emptyProtobufList();

    static {
        aujb aujbVar = new aujb();
        a = aujbVar;
        aopi.registerDefaultInstance(aujb.class, aujbVar);
    }

    private aujb() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐉ\u0004\u0007ဂ\u0005\bဉ\u0006\tЛ\nဉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", apzg.class, "h", "i", "j", "k", apzg.class, "l", "m"});
            case 3:
                return new aujb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aujb.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
