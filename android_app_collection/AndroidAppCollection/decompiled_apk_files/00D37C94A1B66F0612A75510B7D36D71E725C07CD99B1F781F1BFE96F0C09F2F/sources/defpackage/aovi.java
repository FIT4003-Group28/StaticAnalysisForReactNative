package defpackage;
/* compiled from: PG */
/* renamed from: aovi  reason: default package */
/* loaded from: classes.dex */
public final class aovi extends aopi implements aoqv {
    public static final aovi a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public aunb d;
    private int f;
    private aoux g;
    private byte h = 2;

    static {
        aovi aoviVar = new aovi();
        a = aoviVar;
        aopi.registerDefaultInstance(aovi.class, aoviVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aoviVar, aoviVar, null, 366527935, aosj.MESSAGE, aovi.class);
    }

    private aovi() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0004ဌ\u0003\u0005ᐉ\u0004", new Object[]{"f", "g", "c", aotr.m, "d"});
            case 3:
                return new aovi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aovi.class) {
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
