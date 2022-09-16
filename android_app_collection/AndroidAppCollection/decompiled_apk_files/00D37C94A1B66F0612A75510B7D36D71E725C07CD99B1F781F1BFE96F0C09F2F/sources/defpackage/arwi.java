package defpackage;
/* compiled from: PG */
/* renamed from: arwi  reason: default package */
/* loaded from: classes2.dex */
public final class arwi extends aopi implements aoqv {
    public static final arwi a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public aroy e;
    public int c = 0;
    private byte h = 2;
    public String f = "";

    static {
        arwi arwiVar = new arwi();
        a = arwiVar;
        aopi.registerDefaultInstance(arwi.class, arwiVar);
    }

    private arwi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004ျ\u0000\u0005ွ\u0000\u0006ျ\u0000\u0007ျ\u0000\bွ\u0000", new Object[]{"d", "c", "b", "e", "f"});
            case 3:
                return new arwi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arwi.class) {
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
