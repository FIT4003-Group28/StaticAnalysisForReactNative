package defpackage;
/* compiled from: PG */
/* renamed from: atfy  reason: default package */
/* loaded from: classes2.dex */
public final class atfy extends aopi implements aoqv {
    public static final atfy a;
    private static volatile aorb d;
    public int b;
    public apzg c;
    private int e;
    private byte f = 2;

    static {
        atfy atfyVar = new atfy();
        a = atfyVar;
        aopi.registerDefaultInstance(atfy.class, atfyVar);
    }

    private atfy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", atti.s, "c"});
            case 3:
                return new atfy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atfy.class) {
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
