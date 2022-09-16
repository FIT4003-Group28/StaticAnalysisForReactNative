package defpackage;
/* compiled from: PG */
/* renamed from: atoh  reason: default package */
/* loaded from: classes2.dex */
public final class atoh extends aopi implements aoqv {
    public static final atoh a;
    private static volatile aorb e;
    public int b;
    private arag f;
    private byte g = 2;
    public String c = "";
    public aoob d = aoob.b;

    static {
        atoh atohVar = new atoh();
        a = atohVar;
        aopi.registerDefaultInstance(atoh.class, atohVar);
    }

    private atoh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new atoh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atoh.class) {
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
