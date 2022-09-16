package defpackage;
/* compiled from: PG */
/* renamed from: audp  reason: default package */
/* loaded from: classes2.dex */
public final class audp extends aopi implements aoqv {
    public static final audp a;
    private static volatile aorb e;
    public int b;
    public avhn c;
    public apzg d;
    private arag f;
    private byte g = 2;

    static {
        audp audpVar = new audp();
        a = audpVar;
        aopi.registerDefaultInstance(audp.class, audpVar);
    }

    private audp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"b", "f", "c", "d"});
            case 3:
                return new audp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (audp.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
