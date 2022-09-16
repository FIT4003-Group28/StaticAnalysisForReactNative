package defpackage;
/* compiled from: PG */
/* renamed from: aqhn  reason: default package */
/* loaded from: classes2.dex */
public final class aqhn extends aopi implements aoqv {
    public static final aqhn a;
    private static volatile aorb b;
    private int c;
    private aqhx d;
    private aqhp e;
    private aqhy f;
    private aqhr g;
    private aqhg h;
    private aqhq i;
    private aqhv j;
    private byte k = 2;

    static {
        aqhn aqhnVar = new aqhn();
        a = aqhnVar;
        aopi.registerDefaultInstance(aqhn.class, aqhnVar);
    }

    private aqhn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ufbd0⏝\uf6dd搜\u0007\u0000\u0000\u0007\ufbd0⏝ᐉ\u0005\uf354␆ᐉ\u0000\uf379␆ᐉ\u0002\uf2ec⻊ᐉ\u0006\ued84䃲ᐉ\u0001\ue1ea拿ᐉ\u0003\uf6dd搜ᐉ\u0004", new Object[]{"c", "i", "d", "f", "j", "e", "g", "h"});
            case 3:
                return new aqhn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhn.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
