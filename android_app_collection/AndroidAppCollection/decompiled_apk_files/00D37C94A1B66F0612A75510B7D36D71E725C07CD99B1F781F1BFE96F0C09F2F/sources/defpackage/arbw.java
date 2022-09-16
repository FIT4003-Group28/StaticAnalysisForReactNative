package defpackage;
/* compiled from: PG */
/* renamed from: arbw  reason: default package */
/* loaded from: classes2.dex */
public final class arbw extends aopi implements aoqv {
    public static final arbw a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public avhn d;
    public avhn e;
    public avhn f;
    public arhs g;
    public apok i;
    public apok j;
    private aoux l;
    private byte m = 2;
    public aopu h = emptyProtobufList();

    static {
        arbw arbwVar = new arbw();
        a = arbwVar;
        aopi.registerDefaultInstance(arbw.class, arbwVar);
    }

    private arbw() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\t\u0001ᐉ\b\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bЛ\tᐉ\u0005\nᐉ\u0006", new Object[]{"b", "l", "c", "d", "e", "f", "g", "h", arag.class, "i", "j"});
            case 3:
                return new arbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arbw.class) {
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
