package defpackage;
/* compiled from: PG */
/* renamed from: atix  reason: default package */
/* loaded from: classes2.dex */
public final class atix extends aopi implements aoqv {
    public static final atix a;
    private static volatile aorb h;
    public int b;
    public atjc c;
    public ativ d;
    public atiu f;
    private aoux i;
    private byte j = 2;
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        atix atixVar = new atix();
        a = atixVar;
        aopi.registerDefaultInstance(atix.class, atixVar);
    }

    private atix() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001ᐉ\u0001\u0002Л\u0003ᐉ\u0005\u0004ည\u0006\u0005ᐉ\u0002\u0006ᐉ\u0000", new Object[]{"b", "d", "e", atja.class, "i", "g", "f", "c"});
            case 3:
                return new atix();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atix.class) {
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
