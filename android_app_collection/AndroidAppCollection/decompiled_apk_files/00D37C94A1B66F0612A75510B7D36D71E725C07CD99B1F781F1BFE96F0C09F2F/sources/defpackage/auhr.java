package defpackage;
/* compiled from: PG */
/* renamed from: auhr  reason: default package */
/* loaded from: classes2.dex */
public final class auhr extends aopi implements aoqv {
    public static final auhr a;
    private static volatile aorb h;
    public int b;
    public auhs c;
    public aozy e;
    private aoux i;
    private byte j = 2;
    public aopu d = emptyProtobufList();
    public aoob f = aoob.b;
    public String g = "";

    static {
        auhr auhrVar = new auhr();
        a = auhrVar;
        aopi.registerDefaultInstance(auhr.class, auhrVar);
    }

    private auhr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", auif.class, "e", "i", "f", "g"});
            case 3:
                return new auhr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auhr.class) {
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
