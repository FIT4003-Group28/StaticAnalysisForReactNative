package defpackage;
/* compiled from: PG */
/* renamed from: apbx  reason: default package */
/* loaded from: classes.dex */
public final class apbx extends aopi implements aoqv {
    public static final apbx a;
    private static volatile aorb e;
    public int b;
    public atpl c;
    public atoo d;
    private byte f = 2;

    static {
        apbx apbxVar = new apbx();
        a = apbxVar;
        aopi.registerDefaultInstance(apbx.class, apbxVar);
    }

    private apbx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ufe1a⌶ﮜ\u2dd7\u0002\u0000\u0000\u0002\ufe1a⌶ᐉ\u0000ﮜ\u2dd7ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new apbx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apbx.class) {
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
