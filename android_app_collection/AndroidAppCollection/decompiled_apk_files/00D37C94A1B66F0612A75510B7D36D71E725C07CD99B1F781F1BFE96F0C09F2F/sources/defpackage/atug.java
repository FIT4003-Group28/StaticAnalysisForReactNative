package defpackage;
/* compiled from: PG */
/* renamed from: atug  reason: default package */
/* loaded from: classes2.dex */
public final class atug extends aopi implements aoqv {
    public static final atug a;
    private static volatile aorb g;
    public int b;
    public atuh c;
    public atuj d;
    public atui e;
    public atul f;
    private byte h = 2;

    static {
        atug atugVar = new atug();
        a = atugVar;
        aopi.registerDefaultInstance(atug.class, atugVar);
    }

    private atug() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf067│\ueec5㓷\u0004\u0000\u0000\u0004\uf067│ᐉ\u0001\ue621┌ᐉ\u0000\ueaae┢ᐉ\u0003\ueec5㓷ᐉ\u0002", new Object[]{"b", "d", "c", "f", "e"});
            case 3:
                return new atug();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atug.class) {
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
