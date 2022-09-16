package defpackage;
/* compiled from: PG */
/* renamed from: ashx  reason: default package */
/* loaded from: classes2.dex */
public final class ashx extends aopi implements aoqv {
    public static final ashx a;
    private static volatile aorb e;
    public int b;
    private arag f;
    private apzg g;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        ashx ashxVar = new ashx();
        a = ashxVar;
        aopi.registerDefaultInstance(ashx.class, ashxVar);
    }

    private ashx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004", new Object[]{"b", "f", "c", "d", "g"});
            case 3:
                return new ashx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ashx.class) {
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
