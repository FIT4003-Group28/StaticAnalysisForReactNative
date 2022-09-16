package defpackage;
/* compiled from: PG */
/* renamed from: aula  reason: default package */
/* loaded from: classes2.dex */
public final class aula extends aopi implements aoqv {
    public static final aula a;
    private static volatile aorb g;
    public int b;
    public avyp c;
    public aunb d;
    public aunb e;
    public arhs f;
    private arag h;
    private aoux i;
    private aunb j;
    private byte k = 2;

    static {
        aula aulaVar = new aula();
        a = aulaVar;
        aopi.registerDefaultInstance(aula.class, aulaVar);
    }

    private aula() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0002\bᐉ\u0007", new Object[]{"b", "c", "d", "f", "h", "i", "e", "j"});
            case 3:
                return new aula();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aula.class) {
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
