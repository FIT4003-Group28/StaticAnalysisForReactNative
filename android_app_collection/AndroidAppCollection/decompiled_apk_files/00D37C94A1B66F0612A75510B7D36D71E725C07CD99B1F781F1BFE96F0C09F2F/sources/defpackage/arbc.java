package defpackage;
/* compiled from: PG */
/* renamed from: arbc  reason: default package */
/* loaded from: classes2.dex */
public final class arbc extends aopi implements aoqv {
    public static final arbc a;
    private static volatile aorb i;
    public int b;
    public aunb c;
    public boolean e;
    public apzg f;
    public apzg g;
    public apzg h;
    private byte j = 2;
    public String d = "";

    static {
        arbc arbcVar = new arbc();
        a = arbcVar;
        aopi.registerDefaultInstance(arbc.class, arbcVar);
    }

    private arbc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arbc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arbc.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
