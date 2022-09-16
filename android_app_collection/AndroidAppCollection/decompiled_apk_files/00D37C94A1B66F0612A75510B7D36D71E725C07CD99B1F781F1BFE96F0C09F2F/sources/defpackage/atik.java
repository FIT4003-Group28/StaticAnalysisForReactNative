package defpackage;
/* compiled from: PG */
/* renamed from: atik  reason: default package */
/* loaded from: classes2.dex */
public final class atik extends aopi implements aoqv {
    public static final atik a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atik atikVar = new atik();
        a = atikVar;
        aopi.registerDefaultInstance(atik.class, atikVar);
    }

    private atik() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf03a\u2b94\uf03a\u2b94\u0001\u0000\u0000\u0001\uf03a\u2b94ᐼ\u0000", new Object[]{"c", "b", apmk.class});
            case 3:
                return new atik();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atik.class) {
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
