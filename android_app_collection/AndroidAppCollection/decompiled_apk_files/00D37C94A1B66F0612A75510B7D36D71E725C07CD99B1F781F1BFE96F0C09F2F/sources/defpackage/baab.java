package defpackage;
/* compiled from: PG */
/* renamed from: baab  reason: default package */
/* loaded from: classes2.dex */
public final class baab extends aopi implements aoqv {
    public static final baab a;
    private static volatile aorb f;
    public int b;
    public long d;
    private byte g = 2;
    public String c = "";
    public String e = "";

    static {
        baab baabVar = new baab();
        a = baabVar;
        aopi.registerDefaultInstance(baab.class, baabVar);
    }

    private baab() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new baab();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (baab.class) {
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
