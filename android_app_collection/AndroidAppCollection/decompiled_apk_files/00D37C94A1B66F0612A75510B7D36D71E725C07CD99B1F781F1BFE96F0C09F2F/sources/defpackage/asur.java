package defpackage;
/* compiled from: PG */
/* renamed from: asur  reason: default package */
/* loaded from: classes2.dex */
public final class asur extends aopi implements aoqv {
    public static final asur a;
    private static volatile aorb i;
    public int b;
    public long c;
    public arag d;
    public arag e;
    public avhn f;
    public asuq h;
    private boolean j;
    private aunb k;
    private asus l;
    private byte m = 2;
    public aopu g = emptyProtobufList();

    static {
        asur asurVar = new asur();
        a = asurVar;
        aopi.registerDefaultInstance(asur.class, asurVar);
    }

    private asur() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0007\u0001ဂ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0006\tᐉ\u0005\nᐉ\b", new Object[]{"b", "c", "j", "d", "e", "f", "g", apok.class, "l", "k", "h"});
            case 3:
                return new asur();
            case 4:
                return new aopa((byte[]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asur.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
