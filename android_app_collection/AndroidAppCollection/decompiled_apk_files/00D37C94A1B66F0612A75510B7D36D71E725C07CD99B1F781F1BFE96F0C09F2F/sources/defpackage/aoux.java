package defpackage;
/* compiled from: PG */
/* renamed from: aoux  reason: default package */
/* loaded from: classes.dex */
public final class aoux extends aopi implements aoqv {
    public static final aoux a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;
    private anhd f;
    private byte g = 2;

    static {
        aoux aouxVar = new aoux();
        a = aouxVar;
        aopi.registerDefaultInstance(aoux.class, aouxVar);
    }

    private aoux() {
        emptyIntList();
        this.d = -1;
        aopi.emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001«\u0003\u0000\u0000\u0001\u0001င\u0000\u0083င\u0005«ᐉ\u0006", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new aoux();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoux.class) {
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
