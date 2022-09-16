package defpackage;
/* compiled from: PG */
/* renamed from: augd  reason: default package */
/* loaded from: classes2.dex */
public final class augd extends aopi implements aoqv {
    public static final augd a;
    private static volatile aorb g;
    public int b;
    public avhn c;
    public apzg d;
    public auge e;
    private aunb h;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        augd augdVar = new augd();
        a = augdVar;
        aopi.registerDefaultInstance(augd.class, augdVar);
    }

    private augd() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0004\u0005ည\u0005\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e", "i", "f", "h"});
            case 3:
                return new augd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (augd.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
