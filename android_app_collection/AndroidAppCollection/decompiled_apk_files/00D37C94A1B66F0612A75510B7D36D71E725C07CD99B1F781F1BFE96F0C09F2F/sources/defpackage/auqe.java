package defpackage;
/* compiled from: PG */
/* renamed from: auqe  reason: default package */
/* loaded from: classes2.dex */
public final class auqe extends aopi implements aoqv {
    public static final auqe a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auqe auqeVar = new auqe();
        a = auqeVar;
        aopi.registerDefaultInstance(auqe.class, auqeVar);
    }

    private auqe() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue6c7㊂\ue6c7㊂\u0001\u0000\u0000\u0001\ue6c7㊂ᐼ\u0000", new Object[]{"c", "b", auqa.class});
            case 3:
                return new auqe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auqe.class) {
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
