package defpackage;
/* compiled from: PG */
/* renamed from: avzw  reason: default package */
/* loaded from: classes2.dex */
public final class avzw extends aopi implements aoqv {
    public static final avzw a;
    private static volatile aorb e;
    public int b;
    public avhn c;
    public arag d;
    private avaz f;
    private apzg g;
    private arag h;
    private arag i;
    private avzx j;
    private ateb k;
    private aunb l;
    private aunb m;
    private aoux n;
    private byte o = 2;

    static {
        avzw avzwVar = new avzw();
        a = avzwVar;
        aopi.registerDefaultInstance(avzw.class, avzwVar);
    }

    private avzw() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\n\u000bᐉ\u0007\u000eᐉ\t\u000fᐉ\u0005\u0010ᐉ\b", new Object[]{"b", "c", "d", "f", "g", "h", "j", "n", "k", "m", "i", "l"});
            case 3:
                return new avzw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avzw.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
