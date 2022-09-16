package defpackage;
/* compiled from: PG */
/* renamed from: asbz  reason: default package */
/* loaded from: classes2.dex */
public final class asbz extends aopi implements aoqv {
    public static final asbz a;
    private static volatile aorb o;
    public int b;
    public arpa c;
    public long d;
    public asca e;
    public ascc f;
    public auna g;
    public aoob h;
    public asbw i;
    public asbx j;
    public aopu k;
    public asbr l;
    public aopu m;
    public aopu n;
    private aoux p;
    private ascd q;
    private arbf r;
    private byte s = 2;

    static {
        asbz asbzVar = new asbz();
        a = asbzVar;
        aopi.registerDefaultInstance(asbz.class, asbzVar);
    }

    private asbz() {
        aoob aoobVar = aoob.b;
        aopi.emptyProtobufList();
        this.h = aoob.b;
        this.k = emptyProtobufList();
        this.m = aopi.emptyProtobufList();
        this.n = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001̉\u000f\u0000\u0003\f\u0001ᐉ\u0001\u0002ဂ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0005\tည\t\nᐉ\u0004\rᐉ\n\u000eᐉ\u0000\u0010ᐉ\u000b\u0012ᐉ\f\u0016\u001a\u001aЛ\u001bᐉ\r\u001cЛ̉ᐉ\u0012", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i", "p", "q", "j", "m", "k", apzg.class, "l", "n", aunb.class, "r"});
            case 3:
                return new asbz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (asbz.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
