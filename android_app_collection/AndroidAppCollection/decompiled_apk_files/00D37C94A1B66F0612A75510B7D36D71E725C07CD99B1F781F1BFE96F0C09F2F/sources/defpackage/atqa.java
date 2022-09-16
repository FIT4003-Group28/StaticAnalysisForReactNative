package defpackage;
/* compiled from: PG */
/* renamed from: atqa  reason: default package */
/* loaded from: classes2.dex */
public final class atqa extends aopi implements aoqv {
    public static final atqa a;
    private static volatile aorb e;
    public int b;
    public int c;
    public avhn d;
    private byte f = 2;

    static {
        atqa atqaVar = new atqa();
        a = atqaVar;
        aopi.registerDefaultInstance(atqa.class, atqaVar);
    }

    private atqa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဌ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", apog.a, "d"});
            case 3:
                return new atqa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atqa.class) {
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
