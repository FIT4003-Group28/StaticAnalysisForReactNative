package defpackage;
/* compiled from: PG */
/* renamed from: aryn  reason: default package */
/* loaded from: classes2.dex */
public final class aryn extends aopi implements aoqv {
    public static final aryn a;
    private static volatile aorb g;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    private int h;
    private arag i;
    private byte j = 2;
    public String b = "";

    static {
        aryn arynVar = new aryn();
        a = arynVar;
        aopi.registerDefaultInstance(aryn.class, arynVar);
    }

    private aryn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"h", "b", "c", "i", "d", "e", "f"});
            case 3:
                return new aryn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aryn.class) {
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
