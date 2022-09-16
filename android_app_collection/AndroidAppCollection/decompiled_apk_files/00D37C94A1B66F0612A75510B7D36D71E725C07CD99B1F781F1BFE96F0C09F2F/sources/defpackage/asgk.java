package defpackage;
/* compiled from: PG */
/* renamed from: asgk  reason: default package */
/* loaded from: classes2.dex */
public final class asgk extends aopi implements aoqv {
    public static final asgk a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgk asgkVar = new asgk();
        a = asgkVar;
        aopi.registerDefaultInstance(asgk.class, asgkVar);
    }

    private asgk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue7f5ណﵸ\u2bb9\u0003\u0000\u0000\u0003\ue7f5ណᐼ\u0000滋⅚ᐼ\u0000ﵸ\u2bb9ᐼ\u0000", new Object[]{"c", "b", auqh.class, atfx.class, asgx.class});
            case 3:
                return new asgk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgk.class) {
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
