package defpackage;
/* compiled from: PG */
/* renamed from: aptc  reason: default package */
/* loaded from: classes2.dex */
public final class aptc extends aopi implements aoqv {
    public static final aptc a;
    private static volatile aorb d;
    public int b;
    public avaq c;
    private apoj e;
    private byte f = 2;

    static {
        aptc aptcVar = new aptc();
        a = aptcVar;
        aopi.registerDefaultInstance(aptc.class, aptcVar);
    }

    private aptc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue2d9ᩭ\ueb11ἑ\u0002\u0000\u0000\u0002\ue2d9ᩭᐉ\u0000\ueb11ἑᐉ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new aptc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aptc.class) {
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
