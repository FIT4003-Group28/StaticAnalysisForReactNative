package defpackage;
/* compiled from: PG */
/* renamed from: ater  reason: default package */
/* loaded from: classes2.dex */
public final class ater extends aopi implements aoqv {
    public static final ater a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arhs d;
    public apzg e;
    public apzg f;
    public boolean h;
    public int i;
    private arag k;
    private aoux l;
    private byte m = 2;
    public aoob g = aoob.b;

    static {
        ater aterVar = new ater();
        a = aterVar;
        aopi.registerDefaultInstance(ater.class, aterVar);
    }

    private ater() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ည\u0006\tᐉ\u0001\nᐉ\u0004\fဇ\t\u000eဌ\u000b", new Object[]{"b", "c", "d", "e", "l", "g", "k", "f", "h", "i", atdq.d});
            case 3:
                return new ater();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (ater.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
