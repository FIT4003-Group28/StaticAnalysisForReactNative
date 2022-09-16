package defpackage;
/* compiled from: PG */
/* renamed from: arex  reason: default package */
/* loaded from: classes2.dex */
public final class arex extends aopi implements aoqv {
    public static final arex a;
    private static volatile aorb h;
    public int b;
    public arag d;
    public int e;
    public arez f;
    public arew g;
    private aunb i;
    private apzg j;
    private arag k;
    private arag l;
    private aoux m;
    private byte n = 2;
    public aopu c = emptyProtobufList();

    static {
        arex arexVar = new arex();
        a = arexVar;
        aopi.registerDefaultInstance(arex.class, arexVar);
    }

    private arex() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0007\u0001Л\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bင\u0006\tဉ\u0007\u000bᐉ\t\fဉ\n\u0011ᐉ\u0000", new Object[]{"b", "c", arfa.class, "d", "j", "k", "l", "e", "f", "m", "g", "i"});
            case 3:
                return new arex();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arex.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
