package defpackage;
/* compiled from: PG */
/* renamed from: arlv  reason: default package */
/* loaded from: classes2.dex */
public final class arlv extends aopi implements aoqv {
    public static final arlv a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arlv arlvVar = new arlv();
        a = arlvVar;
        aopi.registerDefaultInstance(arlv.class, arlvVar);
    }

    private arlv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue53c⡇\ue932귣\u0003\u0000\u0000\u0003\ue53c⡇ᐼ\u0000\uec8bꎥᐼ\u0000\ue932귣ᐼ\u0000", new Object[]{"c", "b", avdv.class, atjl.class, apzi.class});
            case 3:
                return new arlv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arlv.class) {
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
