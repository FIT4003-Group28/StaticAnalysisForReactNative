package defpackage;
/* compiled from: PG */
/* renamed from: auez  reason: default package */
/* loaded from: classes2.dex */
public final class auez extends aopi implements aoqv {
    public static final auez a;
    private static volatile aorb i;
    public int b;
    public apok c;
    public arag d;
    public int e;
    public int f;
    public int g;
    public int h;
    private arag j;
    private arag k;
    private arag l;
    private aufa m;
    private byte n = 2;

    static {
        auez auezVar = new auez();
        a = auezVar;
        aopi.registerDefaultInstance(auez.class, auezVar);
    }

    private auez() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003င\u0005\u0004င\u0006\u0005င\u0007\u0006င\b\u0007ᐉ\u0002\tᐉ\u0003\fᐉ\n\rᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m"});
            case 3:
                return new auez();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auez.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
