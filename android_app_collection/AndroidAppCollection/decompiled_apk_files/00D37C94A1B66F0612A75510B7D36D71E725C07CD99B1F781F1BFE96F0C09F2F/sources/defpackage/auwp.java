package defpackage;
/* compiled from: PG */
/* renamed from: auwp  reason: default package */
/* loaded from: classes2.dex */
public final class auwp extends aopi implements aoqv {
    public static final auwp a;
    private static volatile aorb g;
    public int b;
    public auwq c;
    public apaq d;
    public avkt f;
    private aoux h;
    private aozz i;
    private byte j = 2;
    public aoob e = aoob.b;

    static {
        auwp auwpVar = new auwp();
        a = auwpVar;
        aopi.registerDefaultInstance(auwp.class, auwpVar);
    }

    private auwp() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\u0006ည\u0003\bဉ\u0004\tᐉ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "i"});
            case 3:
                return new auwp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auwp.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
