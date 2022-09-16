package defpackage;
/* compiled from: PG */
/* renamed from: asue  reason: default package */
/* loaded from: classes2.dex */
public final class asue extends aopi implements aoqv {
    public static final asue a;
    private static volatile aorb g;
    public Object c;
    public int d;
    public boolean e;
    public int f;
    private int h;
    private apzg i;
    public int b = 0;
    private byte j = 2;

    static {
        asue asueVar = new asue();
        a = asueVar;
        aopi.registerDefaultInstance(asue.class, asueVar);
    }

    private asue() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ᐉ\u0003\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{"c", "b", "h", "d", asnz.u, "e", "f", "i", arag.class, aunb.class});
            case 3:
                return new asue();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asue.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
