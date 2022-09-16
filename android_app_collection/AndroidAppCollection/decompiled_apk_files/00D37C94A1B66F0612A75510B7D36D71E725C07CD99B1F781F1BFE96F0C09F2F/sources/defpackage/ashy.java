package defpackage;
/* compiled from: PG */
/* renamed from: ashy  reason: default package */
/* loaded from: classes2.dex */
public final class ashy extends aopi implements aoqv {
    public static final ashy a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public arhs g;
    public boolean h;
    public apzg i;
    public aunb j;
    public aunb k;
    public int c = 0;
    private byte m = 2;

    static {
        ashy ashyVar = new ashy();
        a = ashyVar;
        aopi.registerDefaultInstance(ashy.class, ashyVar);
    }

    private ashy() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ျ\u0000\u0003့\u0000\u0004ᐉ\u0004\u0005ဇ\u0005\u0007ᐉ\u0001\bᐉ\u0007\tᐉ\b\nᐉ\t", new Object[]{"d", "c", "b", "e", "g", "h", "f", "i", "j", "k"});
            case 3:
                return new ashy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (ashy.class) {
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
