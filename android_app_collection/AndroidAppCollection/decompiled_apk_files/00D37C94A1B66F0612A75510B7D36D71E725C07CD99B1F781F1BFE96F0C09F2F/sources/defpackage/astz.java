package defpackage;
/* compiled from: PG */
/* renamed from: astz  reason: default package */
/* loaded from: classes2.dex */
public final class astz extends aopi implements aoqv {
    public static final astz a;
    private static volatile aorb b;
    private int c;
    private aqhu d;
    private assn e;
    private astw f;
    private asuc g;
    private atfj h;
    private astv i;
    private asty j;
    private byte k = 2;

    static {
        astz astzVar = new astz();
        a = astzVar;
        aopi.registerDefaultInstance(astz.class, astzVar);
    }

    private astz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ufd47Ὲﱉ䒃\u0007\u0000\u0000\u0007\ufd47Ὲᐉ\n\ue87aℂᐉ\u0000\ue90f⡜ᐉ\u0007\ue0de⤦ᐉ\t\uf02dⴱᐉ\f\ue55b㟮ᐉ\u0001ﱉ䒃ᐉ\r", new Object[]{"c", "h", "d", "f", "g", "i", "e", "j"});
            case 3:
                return new astz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (astz.class) {
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
