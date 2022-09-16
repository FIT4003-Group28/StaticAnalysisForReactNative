package defpackage;
/* compiled from: PG */
/* renamed from: angj  reason: default package */
/* loaded from: classes.dex */
public final class angj extends aopi implements aoqv {
    public static final angj a;
    private static volatile aorb g;
    public int b;
    public int f;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        angj angjVar = new angj();
        a = angjVar;
        aopi.registerDefaultInstance(angj.class, angjVar);
    }

    private angj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new angj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (angj.class) {
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
