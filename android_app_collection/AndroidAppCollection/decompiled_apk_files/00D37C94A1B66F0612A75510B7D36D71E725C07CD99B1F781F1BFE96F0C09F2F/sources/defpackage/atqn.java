package defpackage;
/* compiled from: PG */
/* renamed from: atqn  reason: default package */
/* loaded from: classes2.dex */
public final class atqn extends aopi implements aoqv {
    public static final atqn a;
    private static volatile aorb d;
    public int b;
    private atqo e;
    private byte f = 2;
    public String c = "";

    static {
        atqn atqnVar = new atqn();
        a = atqnVar;
        aopi.registerDefaultInstance(atqn.class, atqnVar);
    }

    private atqn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002ဈ\u0001\u0004ᐉ\u0003", new Object[]{"b", "c", "e"});
            case 3:
                return new atqn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atqn.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
