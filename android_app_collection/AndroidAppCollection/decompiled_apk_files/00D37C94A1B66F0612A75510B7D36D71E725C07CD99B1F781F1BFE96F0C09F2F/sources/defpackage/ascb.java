package defpackage;
/* compiled from: PG */
/* renamed from: ascb  reason: default package */
/* loaded from: classes2.dex */
public final class ascb extends aopi implements aoqv {
    public static final ascb a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ascb ascbVar = new ascb();
        a = ascbVar;
        aopi.registerDefaultInstance(ascb.class, ascbVar);
    }

    private ascb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue7f5ណ\ue02a⦨\u0003\u0000\u0000\u0003\ue7f5ណᐼ\u0000\uf7cbᢸᐼ\u0000\ue02a⦨ᐼ\u0000", new Object[]{"c", "b", auqh.class, auuf.class, aupr.class});
            case 3:
                return new ascb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ascb.class) {
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
