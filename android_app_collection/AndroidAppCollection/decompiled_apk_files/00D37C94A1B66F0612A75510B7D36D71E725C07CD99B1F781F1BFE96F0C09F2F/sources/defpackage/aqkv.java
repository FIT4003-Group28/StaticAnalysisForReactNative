package defpackage;
/* compiled from: PG */
/* renamed from: aqkv  reason: default package */
/* loaded from: classes2.dex */
public final class aqkv extends aopi implements aoqv {
    public static final aqkv a;
    private static volatile aorb e;
    public int b;
    public aqkx c;
    public aoqp d = aoqp.a;
    private byte f = 2;

    static {
        aqkv aqkvVar = new aqkv();
        a = aqkvVar;
        aopi.registerDefaultInstance(aqkv.class, aqkvVar);
    }

    private aqkv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001ဉ\u0000\u0002в", new Object[]{"b", "c", "d", aqku.a});
            case 3:
                return new aqkv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqkv.class) {
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
