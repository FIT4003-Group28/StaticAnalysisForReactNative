package defpackage;
/* compiled from: PG */
/* renamed from: audl  reason: default package */
/* loaded from: classes2.dex */
public final class audl extends aopi implements aoqv {
    public static final audl a;
    private static volatile aorb g;
    public int b;
    public atof c;
    public atoh d;
    public augq e;
    public aumx f;
    private byte h = 2;

    static {
        audl audlVar = new audl();
        a = audlVar;
        aopi.registerDefaultInstance(audl.class, audlVar);
    }

    private audl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueee9ᣑﰖ㯒\u0004\u0000\u0000\u0003\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0002\uf697᳗ᐉ\u0003ﰖ㯒ᐉ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new audl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (audl.class) {
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
