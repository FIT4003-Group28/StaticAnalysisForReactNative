package defpackage;
/* compiled from: PG */
/* renamed from: aurs  reason: default package */
/* loaded from: classes2.dex */
public final class aurs extends aopi implements aoqv {
    public static final aurs a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apzg f;
    public apzg g;
    private arag i;
    private arag j;
    private arag k;
    private aoux l;
    private byte m = 2;

    static {
        aurs aursVar = new aurs();
        a = aursVar;
        aopi.registerDefaultInstance(aurs.class, aursVar);
    }

    private aurs() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\t\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ᐉ\u0002\u0004ᐉ\u0007\u0005ᐉ\b\u0007ᐉ\u0003\tᐉ\u000b\u000bᐉ\u0005\fᐉ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "i", "l", "j", "k"});
            case 3:
                return new aurs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aurs.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
