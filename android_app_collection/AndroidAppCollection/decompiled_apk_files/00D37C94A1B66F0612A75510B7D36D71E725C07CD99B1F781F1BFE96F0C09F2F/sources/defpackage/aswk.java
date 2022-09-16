package defpackage;
/* compiled from: PG */
/* renamed from: aswk  reason: default package */
/* loaded from: classes2.dex */
public final class aswk extends aopi implements aoqv {
    public static final aswk a;
    private static volatile aorb l;
    public int b;
    public aswj d;
    public aswj e;
    public avhn f;
    public avhn g;
    public apzg h;
    public arag i;
    public aovs j;
    private byte m = 2;
    public String c = "";
    public String k = "";

    static {
        aswk aswkVar = new aswk();
        a = aswkVar;
        aopi.registerDefaultInstance(aswk.class, aswkVar);
    }

    private aswk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0006\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ဉ\u0007\bᐉ\u0003\tᐉ\u0004\nဈ\b", new Object[]{"b", "c", "d", "e", "h", "i", "j", "f", "g", "k"});
            case 3:
                return new aswk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aswk.class) {
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
