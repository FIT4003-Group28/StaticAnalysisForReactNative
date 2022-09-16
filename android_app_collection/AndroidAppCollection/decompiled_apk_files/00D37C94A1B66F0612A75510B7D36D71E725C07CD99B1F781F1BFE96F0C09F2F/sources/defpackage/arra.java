package defpackage;
/* compiled from: PG */
/* renamed from: arra  reason: default package */
/* loaded from: classes2.dex */
public final class arra extends aopi implements aoqv {
    public static final arra a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public aroy e;
    public int c = 0;
    private byte h = 2;
    public String f = "";

    static {
        arra arraVar = new arra();
        a = arraVar;
        aopi.registerDefaultInstance(arra.class, arraVar);
    }

    private arra() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဈ\u0004\u0005ြ\u0000", new Object[]{"d", "c", "b", "e", arrd.class, arrc.class, "f", arre.class});
            case 3:
                return new arra();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arra.class) {
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
