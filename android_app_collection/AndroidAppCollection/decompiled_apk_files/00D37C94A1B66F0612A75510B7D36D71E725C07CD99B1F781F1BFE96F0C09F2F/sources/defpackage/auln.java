package defpackage;
/* compiled from: PG */
/* renamed from: auln  reason: default package */
/* loaded from: classes2.dex */
public final class auln extends aopi implements aoqv {
    public static final auln a;
    private static volatile aorb j;
    public int b;
    public Object d;
    public avhn e;
    public apzg f;
    public arag h;
    public int i;
    private aoux k;
    public int c = 0;
    private byte l = 2;
    public aoob g = aoob.b;

    static {
        auln aulnVar = new auln();
        a = aulnVar;
        aopi.registerDefaultInstance(auln.class, aulnVar);
    }

    private auln() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0005\u0007ᐼ\u0000\bျ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "k", "h", "i", avgg.a(), arhs.class});
            case 3:
                return new auln();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (auln.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
