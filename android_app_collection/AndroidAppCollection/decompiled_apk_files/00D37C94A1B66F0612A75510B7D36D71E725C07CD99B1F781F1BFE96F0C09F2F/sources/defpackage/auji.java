package defpackage;
/* compiled from: PG */
/* renamed from: auji  reason: default package */
/* loaded from: classes2.dex */
public final class auji extends aopi implements aoqv {
    public static final auji a;
    private static volatile aorb q;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arhs f;
    public avhn g;
    public apzg h;
    public ates j;
    public aujh k;
    public long l;
    public long m;
    public aozy n;
    private aoux r;
    private byte s = 2;
    public aopu i = emptyProtobufList();
    public aoob o = aoob.b;
    public String p = "";

    static {
        auji aujiVar = new auji();
        a = aujiVar;
        aopi.registerDefaultInstance(auji.class, aujiVar);
    }

    private auji() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007Л\bᐉ\u0006\tᐉ\u000b\nည\f\u000bဉ\u0007\fဂ\b\rဂ\t\u000eᐉ\n\u000fဈ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", apzg.class, "j", "r", "o", "k", "l", "m", "n", "p"});
            case 3:
                return new auji();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (auji.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
