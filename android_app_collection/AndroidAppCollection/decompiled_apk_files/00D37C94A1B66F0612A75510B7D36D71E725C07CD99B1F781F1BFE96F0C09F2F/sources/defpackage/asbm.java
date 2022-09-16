package defpackage;
/* compiled from: PG */
/* renamed from: asbm  reason: default package */
/* loaded from: classes2.dex */
public final class asbm extends aopi implements aoqv {
    public static final asbm a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    public int d;
    private byte h = 2;
    public String e = "";
    public String f = "";

    static {
        asbm asbmVar = new asbm();
        a = asbmVar;
        aopi.registerDefaultInstance(asbm.class, asbmVar);
    }

    private asbm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", asbk.a(), "e", "f"});
            case 3:
                return new asbm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asbm.class) {
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
