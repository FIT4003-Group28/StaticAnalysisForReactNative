package defpackage;
/* compiled from: PG */
/* renamed from: argt  reason: default package */
/* loaded from: classes2.dex */
public final class argt extends aopi implements aoqv {
    public static final argt a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public argy e;
    public int c = 0;
    private byte g = 2;

    static {
        argt argtVar = new argt();
        a = argtVar;
        aopi.registerDefaultInstance(argt.class, argtVar);
    }

    private argt() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\ue1c8㕰\uf152拄\u0003\u0000\u0000\u0003\ue1c8㕰ᐉ\u0000\uf707㥚ᐼ\u0000\uf152拄ᐼ\u0000", new Object[]{"d", "c", "b", "e", auob.class, auxp.class});
            case 3:
                return new argt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (argt.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
