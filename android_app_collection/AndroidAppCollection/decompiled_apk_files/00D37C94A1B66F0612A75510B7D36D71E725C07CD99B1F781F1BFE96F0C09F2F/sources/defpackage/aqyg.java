package defpackage;
/* compiled from: PG */
/* renamed from: aqyg  reason: default package */
/* loaded from: classes2.dex */
public final class aqyg extends aopi implements aoqv {
    public static final aqyg a;
    private static volatile aorb b;
    private int c;
    private aqyf d;
    private byte e = 2;

    static {
        aqyg aqygVar = new aqyg();
        a = aqygVar;
        aopi.registerDefaultInstance(aqyg.class, aqygVar);
    }

    private aqyg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001擄\u2453擄\u2453\u0001\u0000\u0000\u0001擄\u2453ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqyg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqyg.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
