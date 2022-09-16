package defpackage;
/* compiled from: PG */
/* renamed from: autx  reason: default package */
/* loaded from: classes2.dex */
public final class autx extends aopi implements aoqv {
    public static final autx a;
    private static volatile aorb d;
    public int b;
    public auua c;
    private aplz e;
    private atfh f;
    private byte g = 2;

    static {
        autx autxVar = new autx();
        a = autxVar;
        aopi.registerDefaultInstance(autx.class, autxVar);
    }

    private autx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001ￆᡇ\ue496㴵\u0003\u0000\u0000\u0003ￆᡇᐉ\u0001\uf79d⬘ᐉ\u0000\ue496㴵ᐉ\u0003", new Object[]{"b", "e", "c", "f"});
            case 3:
                return new autx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (autx.class) {
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
