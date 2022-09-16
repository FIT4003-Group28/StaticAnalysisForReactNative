package defpackage;
/* compiled from: PG */
/* renamed from: arom  reason: default package */
/* loaded from: classes2.dex */
public final class arom extends aopi implements aoqv {
    public static final arom a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public int e;
    private byte g = 2;
    public String d = "";

    static {
        arom aromVar = new arom();
        a = aromVar;
        aopi.registerDefaultInstance(arom.class, aromVar);
    }

    private arom() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0005ဌ\u0003", new Object[]{"b", "c", "d", "e", atti.d});
            case 3:
                return new arom();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arom.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
