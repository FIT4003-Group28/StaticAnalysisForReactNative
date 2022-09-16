package defpackage;
/* compiled from: PG */
/* renamed from: augr  reason: default package */
/* loaded from: classes2.dex */
public final class augr extends aopi implements aoqv {
    public static final augr a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private arag e;
    private apzg f;
    private aoux g;
    private byte h = 2;

    static {
        augr augrVar = new augr();
        a = augrVar;
        aopi.registerDefaultInstance(augr.class, augrVar);
    }

    private augr() {
        emptyIntList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0003\bᐉ\u0007\u000bᐉ\u0002", new Object[]{"c", "d", "f", "g", "e"});
            case 3:
                return new augr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (augr.class) {
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
