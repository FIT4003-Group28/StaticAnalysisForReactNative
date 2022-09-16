package defpackage;
/* compiled from: PG */
/* renamed from: apsj  reason: default package */
/* loaded from: classes2.dex */
public final class apsj extends aopi implements aoqv {
    public static final apsj a;
    private static volatile aorb g;
    public int b;
    public apos c;
    public apoj d;
    public avbl e;
    public avbh f;
    private byte h = 2;

    static {
        apsj apsjVar = new apsj();
        a = apsjVar;
        aopi.registerDefaultInstance(apsj.class, apsjVar);
    }

    private apsj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb11ἑﺷ䃢\u0004\u0000\u0000\u0004\ueb11ἑᐉ\u0001\ue5d8☢ᐉ\u0000\ue1ae㣚ᐉ\u0002ﺷ䃢ᐉ\u0003", new Object[]{"b", "d", "c", "e", "f"});
            case 3:
                return new apsj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apsj.class) {
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
