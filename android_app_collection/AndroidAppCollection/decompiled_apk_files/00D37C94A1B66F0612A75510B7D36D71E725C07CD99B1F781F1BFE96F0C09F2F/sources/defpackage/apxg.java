package defpackage;
/* compiled from: PG */
/* renamed from: apxg  reason: default package */
/* loaded from: classes2.dex */
public final class apxg extends aopi implements aoqv {
    public static final apxg a;
    private static volatile aorb n;
    public int b;
    public apxk c;
    public apxl d;
    public apxn e;
    public apxi f;
    public apxj g;
    public apxh h;
    public apxm i;
    public apxr j;
    public apxo k;
    public apxp l;
    public apxq m;

    static {
        apxg apxgVar = new apxg();
        a = apxgVar;
        aopi.registerDefaultInstance(apxg.class, apxgVar);
    }

    private apxg() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002T\u000b\u0000\u0000\u0000\u0002ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0014ဉ\u0003 ဉ\u0004)ဉ\u0005?ဉ\u0006@ဉ\u0007Mဉ\bSဉ\tTဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new apxg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (apxg.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
