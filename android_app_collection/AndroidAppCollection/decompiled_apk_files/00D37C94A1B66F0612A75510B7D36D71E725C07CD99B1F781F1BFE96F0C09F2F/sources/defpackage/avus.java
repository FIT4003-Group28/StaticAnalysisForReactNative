package defpackage;
/* compiled from: PG */
/* renamed from: avus  reason: default package */
/* loaded from: classes2.dex */
public final class avus extends aopi implements aoqv {
    public static final avus a;
    private static volatile aorb h;
    public int b;
    public augw c;
    public avvd d;
    public avhj e;
    public avyw f;
    public avtl g;
    private avkr i;
    private byte j = 2;

    static {
        avus avusVar = new avus();
        a = avusVar;
        aopi.registerDefaultInstance(avus.class, avusVar);
    }

    private avus() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\uf5e2ẝ\uf088⩯\u0006\u0000\u0000\u0005\uf5e2ẝᐉ\u0001隷Ἥᐉ\u0005\uf862⏒ᐉ\u0006\uefe0▍ဉ\u0007\uedc2⡷ᐉ\b\uf088⩯ᐉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case 3:
                return new avus();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avus.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
