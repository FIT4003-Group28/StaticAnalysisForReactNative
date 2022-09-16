package defpackage;
/* compiled from: PG */
/* renamed from: asgw  reason: default package */
/* loaded from: classes2.dex */
public final class asgw extends aopi implements aoqv {
    public static final asgw a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgw asgwVar = new asgw();
        a = asgwVar;
        aopi.registerDefaultInstance(asgw.class, asgwVar);
    }

    private asgw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uea3aᮽ\ufbc8歬\u0003\u0000\u0000\u0003\uea3aᮽᐼ\u0000\ue2ad单ᐼ\u0000\ufbc8歬ᐼ\u0000", new Object[]{"c", "b", avfo.class, avqj.class, avsh.class});
            case 3:
                return new asgw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgw.class) {
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
