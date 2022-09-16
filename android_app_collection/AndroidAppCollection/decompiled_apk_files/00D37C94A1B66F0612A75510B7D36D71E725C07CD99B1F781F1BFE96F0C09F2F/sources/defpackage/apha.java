package defpackage;
/* compiled from: PG */
/* renamed from: apha  reason: default package */
/* loaded from: classes.dex */
public final class apha extends aopi implements aoqv {
    public static final apha a;
    private static volatile aorb i;
    public int b;
    public long c;
    public long d;
    public int e;
    public avhn f;
    public aucc g;
    private apzg j;
    private aoux k;
    private byte l = 2;
    public aopu h = emptyProtobufList();

    static {
        apha aphaVar = new apha();
        a = aphaVar;
        aopi.registerDefaultInstance(apha.class, aphaVar);
    }

    private apha() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001ဂ\u0000\u0002ဂ\u0001\bᐉ\u0006\tᐉ\u0007\u000bᐉ\t\rဉ\b\u000e\u001b\u0010င\u0003", new Object[]{"b", "c", "d", "j", "f", "k", "g", "h", aswg.class, "e"});
            case 3:
                return new apha();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apha.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
