package defpackage;
/* compiled from: PG */
/* renamed from: apdv  reason: default package */
/* loaded from: classes.dex */
public final class apdv extends aopi implements aoqv {
    public static final apdv a;
    private static volatile aorb g;
    public int b;
    public avhn c;
    public arag d;
    public apzg e;
    private arag h;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        apdv apdvVar = new apdv();
        a = apdvVar;
        aopi.registerDefaultInstance(apdv.class, apdvVar);
    }

    private apdv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "i"});
            case 3:
                return new apdv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apdv.class) {
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
