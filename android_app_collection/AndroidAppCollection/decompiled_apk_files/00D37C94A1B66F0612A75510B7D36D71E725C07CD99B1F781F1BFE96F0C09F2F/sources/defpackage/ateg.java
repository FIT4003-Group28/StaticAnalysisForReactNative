package defpackage;
/* compiled from: PG */
/* renamed from: ateg  reason: default package */
/* loaded from: classes2.dex */
public final class ateg extends aopi implements aoqv {
    public static final ateg a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public arhs e;
    public aqfr f;
    public int c = 0;
    private byte h = 2;

    static {
        ateg ategVar = new ateg();
        a = ategVar;
        aopi.registerDefaultInstance(ateg.class, ategVar);
    }

    private ateg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐼ\u0000", new Object[]{"d", "c", "b", arag.class, "e", "f", araj.class});
            case 3:
                return new ateg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (ateg.class) {
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
