package defpackage;
/* compiled from: PG */
/* renamed from: atjb  reason: default package */
/* loaded from: classes2.dex */
public final class atjb extends aopi implements aoqv {
    public static final atjb a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atjb atjbVar = new atjb();
        a = atjbVar;
        aopi.registerDefaultInstance(atjb.class, atjbVar);
    }

    private atjb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf171㦖\uf171㦖\u0001\u0000\u0000\u0001\uf171㦖ᐼ\u0000", new Object[]{"c", "b", atix.class});
            case 3:
                return new atjb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atjb.class) {
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
