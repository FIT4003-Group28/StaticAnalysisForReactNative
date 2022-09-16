package defpackage;
/* compiled from: PG */
/* renamed from: aqre  reason: default package */
/* loaded from: classes2.dex */
public final class aqre extends aopi implements aoqv {
    public static final aqre a;
    private static volatile aorb d;
    public int b;
    public aqrd c;
    private byte e = 2;

    static {
        aqre aqreVar = new aqre();
        a = aqreVar;
        aopi.registerDefaultInstance(aqre.class, aqreVar);
    }

    private aqre() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uee5d⇧\uee5d⇧\u0001\u0000\u0000\u0001\uee5d⇧ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqre();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqre.class) {
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
