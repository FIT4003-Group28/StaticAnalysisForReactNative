package defpackage;
/* compiled from: PG */
/* renamed from: awdf  reason: default package */
/* loaded from: classes2.dex */
public final class awdf extends aopi implements aoqv {
    public static final awdf a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awdf awdfVar = new awdf();
        a = awdfVar;
        aopi.registerDefaultInstance(awdf.class, awdfVar);
    }

    private awdf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf03a\u2b94\ue496㴵\u0003\u0000\u0000\u0003\uf03a\u2b94ᐼ\u0000ﭥ㇃ᐼ\u0000\ue496㴵ᐼ\u0000", new Object[]{"c", "b", apmk.class, apmi.class, atfh.class});
            case 3:
                return new awdf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awdf.class) {
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
