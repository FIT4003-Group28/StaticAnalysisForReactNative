package defpackage;
/* compiled from: PG */
/* renamed from: atwr  reason: default package */
/* loaded from: classes2.dex */
public final class atwr extends aopi implements aoqv {
    public static final atwr a;
    private static volatile aorb c;
    public aqft b;
    private int d;
    private byte e = 2;

    static {
        atwr atwrVar = new atwr();
        a = atwrVar;
        aopi.registerDefaultInstance(atwr.class, atwrVar);
    }

    private atwr() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf321Ẑ\uf321Ẑ\u0001\u0000\u0000\u0001\uf321Ẑᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new atwr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atwr.class) {
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
