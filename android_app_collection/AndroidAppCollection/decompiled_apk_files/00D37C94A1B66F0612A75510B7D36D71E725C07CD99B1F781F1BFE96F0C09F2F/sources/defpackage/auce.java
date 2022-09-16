package defpackage;
/* compiled from: PG */
/* renamed from: auce  reason: default package */
/* loaded from: classes2.dex */
public final class auce extends aopi implements aoqv {
    public static final auce a;
    private static volatile aorb k;
    public int b;
    public aueo c;
    public arag d;
    public arag e;
    public apzg g;
    public ates h;
    public int i;
    private aoux l;
    private byte m = 2;
    public aopu f = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        auce auceVar = new auce();
        a = auceVar;
        aopi.registerDefaultInstance(auce.class, auceVar);
    }

    private auce() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0006\bည\u0007\tဌ\u0005", new Object[]{"b", "c", "d", "e", "f", avhc.class, "g", "h", "l", "j", "i", auca.d});
            case 3:
                return new auce();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (auce.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
