package defpackage;
/* compiled from: PG */
/* renamed from: atit  reason: default package */
/* loaded from: classes2.dex */
public final class atit extends aopi implements aoqv {
    public static final atit a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public aunb d;
    public aunb e;
    private aoux i;
    private byte j = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        atit atitVar = new atit();
        a = atitVar;
        aopi.registerDefaultInstance(atit.class, atitVar);
    }

    private atit() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001ᐉ\u0003\u0002ည\u0004\u0003ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007Л", new Object[]{"b", "i", "g", "c", "d", "e", "f", aunb.class});
            case 3:
                return new atit();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atit.class) {
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
