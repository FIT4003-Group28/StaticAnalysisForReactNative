package defpackage;
/* compiled from: PG */
/* renamed from: auyk  reason: default package */
/* loaded from: classes2.dex */
public final class auyk extends aopi implements aoqv {
    public static final auyk a;
    private static volatile aorb i;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public boolean h;
    private aoux j;
    private byte k = 2;
    public aopu g = emptyProtobufList();

    static {
        auyk auykVar = new auyk();
        a = auykVar;
        aopi.registerDefaultInstance(auyk.class, auykVar);
    }

    private auyk() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004Л\u0005ဇ\u0006\u0006ᐉ\u0005\u0007ᐉ\u0007", new Object[]{"b", "c", "d", "e", "g", aunb.class, "h", "f", "j"});
            case 3:
                return new auyk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auyk.class) {
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
