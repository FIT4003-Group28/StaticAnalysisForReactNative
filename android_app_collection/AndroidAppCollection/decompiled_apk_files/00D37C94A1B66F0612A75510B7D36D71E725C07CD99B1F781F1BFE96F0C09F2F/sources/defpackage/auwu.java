package defpackage;
/* compiled from: PG */
/* renamed from: auwu  reason: default package */
/* loaded from: classes2.dex */
public final class auwu extends aopi implements aoqv {
    public static final auwu a;
    private static volatile aorb h;
    public int b;
    public boolean c;
    public arag d;
    public auww e;
    public auwv f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        auwu auwuVar = new auwu();
        a = auwuVar;
        aopi.registerDefaultInstance(auwu.class, auwuVar);
    }

    private auwu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
            case 3:
                return new auwu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auwu.class) {
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
