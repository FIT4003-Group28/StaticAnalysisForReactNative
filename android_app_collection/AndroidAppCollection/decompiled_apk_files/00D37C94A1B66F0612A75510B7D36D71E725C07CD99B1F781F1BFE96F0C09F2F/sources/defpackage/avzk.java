package defpackage;
/* compiled from: PG */
/* renamed from: avzk  reason: default package */
/* loaded from: classes2.dex */
public final class avzk extends aopi implements aoqv {
    public static final avzk a;
    private static volatile aorb b;
    private int c;
    private avaq d;
    private apoj e;
    private byte f = 2;

    static {
        avzk avzkVar = new avzk();
        a = avzkVar;
        aopi.registerDefaultInstance(avzk.class, avzkVar);
    }

    private avzk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue2d9ᩭ\ueb11ἑ\u0002\u0000\u0000\u0002\ue2d9ᩭᐉ\u0000\ueb11ἑᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new avzk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avzk.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
