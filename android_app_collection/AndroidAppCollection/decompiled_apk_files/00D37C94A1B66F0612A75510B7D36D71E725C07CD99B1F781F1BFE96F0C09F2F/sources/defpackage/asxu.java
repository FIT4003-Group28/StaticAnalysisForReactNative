package defpackage;
/* compiled from: PG */
/* renamed from: asxu  reason: default package */
/* loaded from: classes2.dex */
public final class asxu extends aopi implements aoqv {
    public static final asxu a;
    private static volatile aorb g;
    public arag b;
    public arag c;
    public arag d;
    public arag e;
    public boolean f;
    private int h;
    private arag i;
    private byte j = 2;

    static {
        asxu asxuVar = new asxu();
        a = asxuVar;
        aopi.registerDefaultInstance(asxu.class, asxuVar);
    }

    private asxu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0005\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဇ\u0007", new Object[]{"h", "b", "c", "d", "i", "e", "f"});
            case 3:
                return new asxu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asxu.class) {
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
