package defpackage;
/* compiled from: PG */
/* renamed from: atvt  reason: default package */
/* loaded from: classes2.dex */
public final class atvt extends aopi implements aoqv {
    public static final atvt a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public atvu e;
    public atvv f;
    public apzg g;
    private aunb i;
    private aunb j;
    private byte k = 2;

    static {
        atvt atvtVar = new atvt();
        a = atvtVar;
        aopi.registerDefaultInstance(atvt.class, atvtVar);
    }

    private atvt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0006\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j"});
            case 3:
                return new atvt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atvt.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
