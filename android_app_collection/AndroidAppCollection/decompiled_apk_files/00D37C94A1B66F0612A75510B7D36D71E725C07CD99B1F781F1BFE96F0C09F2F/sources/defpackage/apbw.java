package defpackage;
/* compiled from: PG */
/* renamed from: apbw  reason: default package */
/* loaded from: classes.dex */
public final class apbw extends aopi implements aoqv {
    public static final apbw a;
    private static volatile aorb d;
    public aopu b;
    public aopu c;
    private int e;
    private arag f;
    private arag g;
    private aunb h;
    private arag i;
    private byte j = 2;

    static {
        apbw apbwVar = new apbw();
        a = apbwVar;
        aopi.registerDefaultInstance(apbw.class, apbwVar);
    }

    private apbw() {
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0006\u0001Л\u0002Л\u0004ᐉ\u0002\u0005ᐉ\u0000\u0006ᐉ\u0001\u0007ᐉ\u0003", new Object[]{"e", "b", apbv.class, "c", apbu.class, "h", "f", "g", "i"});
            case 3:
                return new apbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apbw.class) {
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
