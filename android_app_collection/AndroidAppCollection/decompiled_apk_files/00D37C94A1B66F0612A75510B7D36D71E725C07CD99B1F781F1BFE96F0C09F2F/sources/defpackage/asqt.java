package defpackage;
/* compiled from: PG */
/* renamed from: asqt  reason: default package */
/* loaded from: classes2.dex */
public final class asqt extends aopi implements aoqv {
    public static final asqt a;
    private static volatile aorb l;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j = "";
    public boolean k;
    private int m;

    static {
        asqt asqtVar = new asqt();
        a = asqtVar;
        aopi.registerDefaultInstance(asqt.class, asqtVar);
    }

    private asqt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0015\n\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\nဇ\b\rဇ\u000b\u000eဇ\f\u0012ဇ\u0010\u0014ဈ\u0012\u0015ဇ\u0013", new Object[]{"m", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new asqt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (asqt.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
