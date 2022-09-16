package defpackage;
/* compiled from: PG */
/* renamed from: auee  reason: default package */
/* loaded from: classes2.dex */
public final class auee extends aopi implements aoqv {
    public static final auee a;
    private static volatile aorb c;
    public audq b;
    private int d;
    private byte e = 2;

    static {
        auee aueeVar = new auee();
        a = aueeVar;
        aopi.registerDefaultInstance(auee.class, aueeVar);
    }

    private auee() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ued74☹\ued74☹\u0001\u0000\u0000\u0001\ued74☹ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new auee();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auee.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
