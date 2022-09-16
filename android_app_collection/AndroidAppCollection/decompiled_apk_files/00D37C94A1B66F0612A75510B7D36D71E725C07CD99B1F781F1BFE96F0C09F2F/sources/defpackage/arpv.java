package defpackage;
/* compiled from: PG */
/* renamed from: arpv  reason: default package */
/* loaded from: classes2.dex */
public final class arpv extends aopi implements aoqv {
    public static final arpv a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arpv arpvVar = new arpv();
        a = arpvVar;
        aopi.registerDefaultInstance(arpv.class, arpvVar);
    }

    private arpv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf073⣂\uf073⣂\u0001\u0000\u0000\u0001\uf073⣂ᐼ\u0000", new Object[]{"c", "b", asuh.class});
            case 3:
                return new arpv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arpv.class) {
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
