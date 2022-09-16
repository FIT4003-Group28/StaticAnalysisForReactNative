package defpackage;
/* compiled from: PG */
/* renamed from: atlp  reason: default package */
/* loaded from: classes2.dex */
public final class atlp extends aopi implements aoqv {
    public static final atlp a;
    private static volatile aorb k;
    public int b;
    public atlo c;
    public avhn d;
    public arag e;
    public arag f;
    public arag g;
    private aoux l;
    private byte m = 2;
    public aopu h = emptyProtobufList();
    public aopu i = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        atlp atlpVar = new atlp();
        a = atlpVar;
        aopi.registerDefaultInstance(atlp.class, atlpVar);
    }

    private atlp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0002\u0007\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0007\u0005ᐉ\b\u0006ည\t\u0007Л\bЛ\u000bဉ\u0001", new Object[]{"b", "d", "e", "f", "g", "l", "j", "h", arag.class, "i", arag.class, "c"});
            case 3:
                return new atlp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atlp.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
