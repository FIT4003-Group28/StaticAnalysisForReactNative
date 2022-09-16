package defpackage;
/* compiled from: PG */
/* renamed from: aubz  reason: default package */
/* loaded from: classes2.dex */
public final class aubz extends aopi implements aoqv {
    public static final aubz a;
    private static volatile aorb d;
    public arag b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        aubz aubzVar = new aubz();
        a = aubzVar;
        aopi.registerDefaultInstance(aubz.class, aubzVar);
    }

    private aubz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new aubz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aubz.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
