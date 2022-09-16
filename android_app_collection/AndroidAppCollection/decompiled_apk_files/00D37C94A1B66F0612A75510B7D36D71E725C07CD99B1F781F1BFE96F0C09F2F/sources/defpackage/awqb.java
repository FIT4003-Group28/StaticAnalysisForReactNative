package defpackage;
/* compiled from: PG */
/* renamed from: awqb  reason: default package */
/* loaded from: classes2.dex */
public final class awqb extends aopi implements aoqv {
    public static final awqb a;
    public static final aopg b;
    private static volatile aorb d;
    public awqa c;
    private int e;
    private aoux f;
    private awpk g;
    private awpl h;
    private awpy i;
    private awmt j;
    private awoz k;
    private awps l;
    private awpx m;
    private awmt n;
    private awmt o;
    private awpm p;
    private byte q = 2;

    static {
        awqb awqbVar = new awqb();
        a = awqbVar;
        aopi.registerDefaultInstance(awqb.class, awqbVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, awqbVar, awqbVar, null, 232954548, aosj.MESSAGE, awqb.class);
    }

    private awqb() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0018\f\u0000\u0000\f\u0001ᐉ\u0012\u0004ᐉ\u0002\u0007ᐉ\u0014\bᐉ\u0015\fᐉ\u0017\u000eᐉ\b\u0011ᐉ\t\u0012ᐉ\u0000\u0013ᐉ\n\u0014ᐉ\u000b\u0015ᐉ\f\u0018ᐉ\u000f", new Object[]{"e", "m", "f", "n", "o", "p", "g", "h", "c", "i", "j", "k", "l"});
            case 3:
                return new awqb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awqb.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
