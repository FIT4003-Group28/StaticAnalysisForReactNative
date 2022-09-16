package defpackage;
/* compiled from: PG */
/* renamed from: apok  reason: default package */
/* loaded from: classes.dex */
public final class apok extends aopi implements aoqv {
    public static final apok a;
    private static volatile aorb e;
    public int b;
    public apoj c;
    public apos d;
    private apol f;
    private apoo g;
    private byte h = 2;

    static {
        apok apokVar = new apok();
        a = apokVar;
        aopi.registerDefaultInstance(apok.class, apokVar);
    }

    private apok() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb11ἑ\uf2c2꒨\u0004\u0000\u0000\u0004\ueb11ἑᐉ\u0000\ue5d8☢ᐉ\u0001\ue110ꈕᐉ\u0003\uf2c2꒨ᐉ\u0004", new Object[]{"b", "c", "d", "f", "g"});
            case 3:
                return new apok();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apok.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
