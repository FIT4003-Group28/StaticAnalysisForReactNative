package defpackage;
/* compiled from: PG */
/* renamed from: atfa  reason: default package */
/* loaded from: classes2.dex */
public final class atfa extends aopi implements aoqv {
    public static final atfa a;
    private static volatile aorb j;
    public int b;
    public Object d;
    public arag e;
    public atfd f;
    public atfb g;
    public apok h;
    private apok k;
    private aoux l;
    public int c = 0;
    private byte m = 2;
    public aoob i = aoob.b;

    static {
        atfa atfaVar = new atfa();
        a = atfaVar;
        aopi.registerDefaultInstance(atfa.class, atfaVar);
    }

    private atfa() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ြ\u0000\u0003ᐉ\u0007\u0004ည\b\u0005ᐉ\u0005\u0006ᐉ\u0001\u0007ᐼ\u0000\bဉ\u0004\tᐉ\u0006", new Object[]{"d", "c", "b", "e", atfg.class, "l", "i", "h", "f", atff.class, "g", "k"});
            case 3:
                return new atfa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atfa.class) {
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
