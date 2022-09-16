package defpackage;
/* compiled from: PG */
/* renamed from: atxn  reason: default package */
/* loaded from: classes2.dex */
public final class atxn extends aopi implements aoqv {
    public static final atxn a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atxn atxnVar = new atxn();
        a = atxnVar;
        aopi.registerDefaultInstance(atxn.class, atxnVar);
    }

    private atxn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueca8㠇\uf173韏\u0002\u0000\u0000\u0002\ueca8㠇ᐼ\u0000\uf173韏ᐼ\u0000", new Object[]{"c", "b", atxk.class, atxh.class});
            case 3:
                return new atxn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atxn.class) {
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
