package defpackage;
/* compiled from: PG */
/* renamed from: aowy  reason: default package */
/* loaded from: classes.dex */
public final class aowy extends aopi implements aoqv {
    public static final aowy a;
    private static volatile aorb m;
    public int b;
    public arag d;
    public arag e;
    public avhn f;
    public aunb g;
    public boolean h;
    public boolean i;
    public apzg j;
    public int k;
    public avhn l;
    private aoux n;
    private arag o;
    private aoxi p;
    private arag q;
    private aoww r;
    private byte s = 2;
    public aoob c = aoob.b;

    static {
        aowy aowyVar = new aowy();
        a = aowyVar;
        aopi.registerDefaultInstance(aowy.class, aowyVar);
    }

    private aowy() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ည\u0001\u0004ᐉ\u0002\u0005ᐉ\u0012\u0006ᐉ\u0004\u0007ဇ\u0006\bဇ\u0007\tᐉ\u0013\fᐉ\b\rᐉ\u0003\u000fᐉ\t\u0010ဌ\n\u0011ᐉ\u000b\u0013ᐉ\u0005\u0015ᐉ\u000e", new Object[]{"b", "n", "c", "d", "r", "f", "h", "i", "l", "j", "e", "o", "k", arhr.a(), "p", "g", "q"});
            case 3:
                return new aowy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aowy.class) {
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
