package defpackage;
/* compiled from: PG */
/* renamed from: aubo  reason: default package */
/* loaded from: classes2.dex */
public final class aubo extends aopi implements aoqv {
    public static final aubo a;
    private static volatile aorb g;
    public aunb c;
    private int h;
    private aoux i;
    private byte j = 2;
    public aopu b = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public String e = "";
    public aoob f = aoob.b;

    static {
        aubo auboVar = new aubo();
        a = auboVar;
        aopi.registerDefaultInstance(aubo.class, auboVar);
    }

    private aubo() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0002\u0003\u0002\u001b\u0004ᐉ\u0000\u0005ည\u0002\u0006ᐉ\u0003\u0007ဈ\u0001\bЛ", new Object[]{"h", "b", avyy.class, "c", "f", "i", "e", "d", aunb.class});
            case 3:
                return new aubo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aubo.class) {
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
